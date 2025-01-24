package com.example.taskify.entities;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "task_categories")
@EntityListeners(AuditingEntityListener.class)
public class TaskCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name", updatable = false, nullable = false)
    private String name;

    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    public TaskCategory(UUID id, String name, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public TaskCategory() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

