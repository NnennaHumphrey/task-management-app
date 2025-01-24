package com.example.taskify.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "task_attachments")
@EntityListeners(AuditingEntityListener.class)
public class TaskAttachement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @ManyToOne
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "file_url", nullable = false)
    private String fileUrl;

    @CreatedDate
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;
}
