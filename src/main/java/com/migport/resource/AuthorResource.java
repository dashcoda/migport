package com.migport.resource;

import java.util.List;
import java.util.Optional;

import com.migport.domain.author.Author;
import com.migport.service.AuthorService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/author")
public class AuthorResource {

    @Inject
    AuthorService authorService;

    @GET
    public List<Author> list() {
        return Author.listAll();
    }

    @GET
    @Path("/{id}")
    public Author get(String id) {
        return Author.findById(id);
    }

    @GET
    @Path("/{name}")
    public String getEmailByName(String name) {
        return authorService.getEmailByName(name);
    }
}
