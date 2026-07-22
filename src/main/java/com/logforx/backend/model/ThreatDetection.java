package com.logforx.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ThreatDetection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String threatType;
    private String severity; // Low, Medium, High, Critical
    private LocalDateTime timestamp;
    private String description;
    private String mitreTechnique;
    private String status; // Active, Resolved

    public ThreatDetection() {
    }

    public ThreatDetection(Long id, String threatType, String severity, LocalDateTime timestamp, String description, String mitreTechnique, String status) {
        this.id = id;
        this.threatType = threatType;
        this.severity = severity;
        this.timestamp = timestamp;
        this.description = description;
        this.mitreTechnique = mitreTechnique;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getThreatType() { return threatType; }
    public void setThreatType(String threatType) { this.threatType = threatType; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getMitreTechnique() { return mitreTechnique; }
    public void setMitreTechnique(String mitreTechnique) { this.mitreTechnique = mitreTechnique; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
