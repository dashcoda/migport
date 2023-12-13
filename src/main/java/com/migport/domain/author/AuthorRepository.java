package com.migport.domain.author;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migport.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {
}
