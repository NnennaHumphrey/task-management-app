package com.example.taskify.entities;

import com.example.taskify.entities.enums.TaskAction;
import com.example.taskify.entities.enums.TaskStatus;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "task_history")
@EntityListeners(AuditingEntityListener.class)
public class TaskHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Enumerated(EnumType.STRING)
    private TaskAction action;

    private LocalDateTime actionTimestamp;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private TaskStatus oldStatus;

    @Enumerated(EnumType.STRING)
    private TaskStatus newStatus;
}
