package com.migport.entity;

import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post extends PanacheEntityBase {

    @Id
    private String id;

    private String author_id;

    private String title;

    private String content;

    @PrePersist
    private void ensureId() {
        this.setId(UUID.randomUUID().toString());
    }
}
