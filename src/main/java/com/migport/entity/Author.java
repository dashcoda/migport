package com.migport.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Author {

    @Id
    private String id;

    private String name;

    private String email;

    @PrePersist
    private void ensureId() {
        this.setId(UUID.randomUUID().toString());
    }

}
