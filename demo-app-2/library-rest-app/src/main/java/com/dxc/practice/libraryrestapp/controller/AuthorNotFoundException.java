package com.dxc.practice.libraryrestapp.controller;

public class AuthorNotFoundException extends RuntimeException{
    AuthorNotFoundException(Integer id) {
        super("Could not find Author " + id);

}
}