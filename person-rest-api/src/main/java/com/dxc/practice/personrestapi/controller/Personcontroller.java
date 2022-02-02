package com.dxc.practice.personrestapi.controller;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import com.dxc.practice.personrestapi.model.Author;
import com.dxc.practice.personrestapi.repository.PersonRepository;
import com.dxc.learning.personrestapi.dto.PersonDTO;
import com.dxc.learning.personrestapi.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Personcontroller {
    @Autowired
    private PersonService personService;
    @Autowired
    private ModelMapper modelMapper;
 private final PersonRepository repository;

  Personcontroller(PersonRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/persons")
 public List<Person> all() {
    return repository.findAll();
  }

  @PostMapping("/persons")
public  Person newPerson(@RequestBody Person newPerson) {
  newPerson.setDob(LocalDate.now());
    return repository.save(newPerson);
  }

  @GetMapping("/persons/{id}")
 public Person one(@PathVariable Integer id) {

    return repository.findById(id)
        .orElseThrow(() -> new PersonNotFoundException(id));
  }

  @PutMapping("/persons/{id}")
  public Person replacePerson(@RequestBody Person newPerson, @PathVariable Integer id) {

    return repository.findById(id)
        .map(person -> {
          person.setName(newPerson.getName());
          person.setEmail(newPerson.getEmail());
          person.setAddress(newPerson.getAddress());
          person.setDob(LocalDate.now());
          return repository.save(person);
        })
        .orElseGet(() -> {
          newPerson.setId(id);
          return repository.save(newPerson);
        });
  }

  @DeleteMapping("/persons/{id}")
 public void deleteAuthor(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}
