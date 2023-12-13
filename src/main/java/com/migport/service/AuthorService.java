package com.migport.service;

import com.migport.domain.author.Author;
import com.migport.domain.author.AuthorRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;

@ApplicationScoped
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GET
    public String getEmailByName(String name) {
        Author author = authorRepository.findByName(name);
        return author.getEmail();
    }

}
