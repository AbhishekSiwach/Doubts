package com.dxc.practice.libraryrestapp.repository;

import com.dxc.practice.libraryrestapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
