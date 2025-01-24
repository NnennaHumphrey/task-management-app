package com.example.taskify.entities;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "task_category_relations")
public class TaskCategoryRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private TaskCategory category;

    public TaskCategoryRelation(UUID id, Task task, TaskCategory category) {
        this.id = id;
        this.task = task;
        this.category = category;
    }

    public TaskCategoryRelation() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }
}
