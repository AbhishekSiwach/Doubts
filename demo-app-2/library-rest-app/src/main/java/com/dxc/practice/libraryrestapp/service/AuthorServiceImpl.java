package com.dxc.practice.libraryrestapp.service;
import java.util.List;
import com.dxc.practice.libraryrestapp.model.Author;
import com.dxc.practice.libraryrestapp.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElseThrow();
    }
    @Override
    public Author getAuthorByName(String name) {

        return null;
    }
    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteAuthor(int id) {
     Author author = getAuthorById(id);
     authorRepository.delete(author);

    }

    @Override
    public List <Author> getAllAuthors() {
        return authorRepository.findAll();
    }

}