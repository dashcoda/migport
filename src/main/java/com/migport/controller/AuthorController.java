package com.migport.controller;

import java.util.Optional;

import com.migport.domain.author.AuthorRepository;
import com.migport.entity.Author;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/author")
public class AuthorController {

    @Inject
    AuthorRepository authorRepository;

    @GET
    @Path("/{id}")
    public String getAuthorName(String id) {
        Optional<Author> author = authorRepository.findById(id);
        return author.isPresent() ? author.get().getName() : "Sorry, we couldn't find the author";
    }
}
