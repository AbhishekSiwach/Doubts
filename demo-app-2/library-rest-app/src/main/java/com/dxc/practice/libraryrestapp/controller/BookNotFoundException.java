package com.dxc.practice.libraryrestapp.controller;

public class BookNotFoundException extends RuntimeException{
    BookNotFoundException(Integer id) {
        super("Could not find Book " + id);

}
}