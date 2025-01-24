package com.example.taskify.entities;

import com.example.taskify.entities.enums.TaskFrequency;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "recurring_tasks")
@EntityListeners(AuditingEntityListener.class)
public class RecurringTask {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Enumerated(EnumType.STRING)
    private TaskFrequency frequency;

    private LocalDateTime nextOccurrence;

    private LocalDateTime createdAt;

    public RecurringTask(UUID id, Task task, TaskFrequency frequency, LocalDateTime nextOccurrence, LocalDateTime createdAt) {
        this.id = id;
        this.task = task;
        this.frequency = frequency;
        this.nextOccurrence = nextOccurrence;
        this.createdAt = createdAt;
    }

    public RecurringTask() {

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

    public TaskFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(TaskFrequency frequency) {
        this.frequency = frequency;
    }

    public LocalDateTime getNextOccurrence() {
        return nextOccurrence;
    }

    public void setNextOccurrence(LocalDateTime nextOccurrence) {
        this.nextOccurrence = nextOccurrence;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}



