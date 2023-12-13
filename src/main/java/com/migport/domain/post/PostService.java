package com.migport.domain.post;

import java.util.List;

import com.migport.entity.Post;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPostsByAuthorId(String authorId) {
        return postRepository.findPostsByAuthorId(authorId);
    }
}
