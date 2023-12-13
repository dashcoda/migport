package com.migport.domain.post;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.migport.entity.Post;

public interface PostRepository extends JpaRepository<Post, String> {

    @Query("SELECT post FROM Post post WHERE post.author_id = :authorId")
    public List<Post> findPostsByAuthorId(String authorId);
}
