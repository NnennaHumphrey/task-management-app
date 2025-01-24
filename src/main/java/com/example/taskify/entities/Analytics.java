package com.example.taskify.entities;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "analytics")
@EntityListeners(AuditingEntityListener.class)
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID analyticsId;

    private int totalUsers = 0;
    private int totalTasks = 0;
    private int completedTasks = 0;
    private int overdueTasks = 0;
    private float taskCompletionRate = 0.0f;
    private float userActivityRate = 0.0f;

    private LocalDateTime lastUpdated;

    public Analytics(UUID analyticsId, int totalUsers, int totalTasks, int completedTasks, int overdueTasks, float taskCompletionRate, float userActivityRate, LocalDateTime lastUpdated) {
        this.analyticsId = analyticsId;
        this.totalUsers = totalUsers;
        this.totalTasks = totalTasks;
        this.completedTasks = completedTasks;
        this.overdueTasks = overdueTasks;
        this.taskCompletionRate = taskCompletionRate;
        this.userActivityRate = userActivityRate;
        this.lastUpdated = lastUpdated;
    }

    public Analytics() {

    }

    public UUID getAnalyticsId() {
        return analyticsId;
    }

    public void setAnalyticsId(UUID analyticsId) {
        this.analyticsId = analyticsId;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public int getOverdueTasks() {
        return overdueTasks;
    }

    public void setOverdueTasks(int overdueTasks) {
        this.overdueTasks = overdueTasks;
    }

    public float getTaskCompletionRate() {
        return taskCompletionRate;
    }

    public void setTaskCompletionRate(float taskCompletionRate) {
        this.taskCompletionRate = taskCompletionRate;
    }

    public float getUserActivityRate() {
        return userActivityRate;
    }

    public void setUserActivityRate(float userActivityRate) {
        this.userActivityRate = userActivityRate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
