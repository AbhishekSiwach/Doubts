package com.dxc.practice.personrestapi.services;
import java.util.List;
import com.dxc.practice.personrestapi.model.Person;

public interface PersonService {

    public Person getPersonById(int id);

    public Person getPersonByName(String name);

    public Person getPersonByEmail(String email);

    public Person getPersonByAddress(String address);

    public Person createPerson(Person person);

    public Person updatePerson(Person person);

    public void deletePerson(int id);

    public List<Person> getAllPersons();

}
}
