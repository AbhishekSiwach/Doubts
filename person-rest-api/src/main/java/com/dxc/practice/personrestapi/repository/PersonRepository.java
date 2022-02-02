package com.dxc.practice.personrestapi.repository;

import com.dxc.practice.libraryrestapp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Person, Integer>{
    
}

