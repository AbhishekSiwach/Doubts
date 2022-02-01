package com.dxc.practice.libraryrestapp.repository;

import com.dxc.practice.libraryrestapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository<Author, Integer>{
    
}