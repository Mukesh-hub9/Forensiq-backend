package com.logforx.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String action; // LOGIN, UPLOAD, ANALYSIS, REPORT_DOWNLOAD, etc.
    private LocalDateTime timestamp;
    private String investigatorId;
    private String details;

    public AuditLog() {
    }

    public AuditLog(Long id, String action, LocalDateTime timestamp, String investigatorId, String details) {
        this.id = id;
        this.action = action;
        this.timestamp = timestamp;
        this.investigatorId = investigatorId;
        this.details = details;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getInvestigatorId() { return investigatorId; }
    public void setInvestigatorId(String investigatorId) { this.investigatorId = investigatorId; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
