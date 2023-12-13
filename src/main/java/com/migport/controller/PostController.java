package com.migport.controller;

import java.util.List;

import com.migport.domain.post.PostService;
import com.migport.entity.Post;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/post")
public class PostController {

    @Inject
    PostService postService;

    @GET
    @Path("/{authorId}")
    public List<Post> getPostsByAuthorId(String authorId) {
        return postService.getPostsByAuthorId(authorId);
    }
}
