package com.example.taskify.entities;

import com.example.taskify.entities.enums.Role;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(unique = true, nullable = false, length = 50)
    private String username;

    @Column(unique = true, nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false)
    private boolean accountActive = true;

    @Column(name = "profile_picture")
    private String profilePictureUrl;

    @Column(name = "enabled", nullable = false)
    private boolean enabled = true;

    @Column(name = "is_verified", nullable = false)
    private boolean isVerified = false;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();

    @LastModifiedBy
    @Column(nullable = false)
    private String lastModifiedBy;

    @CreatedBy
    @Column(nullable = false)
    private String createdBy;

    // Constructors
    public User() {
    }

    public User(UUID id, String username, String email, String password, Role role, String firstName, String lastName,
                boolean accountActive, String profilePictureUrl, boolean enabled, boolean isVerified,
                LocalDateTime createdAt, LocalDateTime updatedAt, String lastModifiedBy, String createdBy) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountActive = accountActive;
        this.profilePictureUrl = profilePictureUrl;
        this.enabled = enabled;
        this.isVerified = isVerified;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
    }

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public void setAccountActive(boolean accountActive) {
        this.accountActive = accountActive;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    // Builder pattern
    public static class UserBuilder {
        private UUID id;
        private String username;
        private String email;
        private String password;
        private Role role;
        private String firstName;
        private String lastName;
        private boolean accountActive;
        private String profilePictureUrl;
        private boolean enabled;
        private boolean isVerified;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String lastModifiedBy;
        private String createdBy;

        public UserBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder role(Role role) {
            this.role = role;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder accountActive(boolean accountActive) {
            this.accountActive = accountActive;
            return this;
        }

        public UserBuilder profilePictureUrl(String profilePictureUrl) {
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }

        public UserBuilder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public UserBuilder isVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public UserBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public UserBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UserBuilder lastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public UserBuilder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public User build() {
            return new User(id, username, email, password, role, firstName, lastName, accountActive, profilePictureUrl,
                    enabled, isVerified, createdAt, updatedAt, lastModifiedBy, createdBy);
        }
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}

