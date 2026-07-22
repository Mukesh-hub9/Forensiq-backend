package com.logforx.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ForensicEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime timestamp;
    private String eventType; // Login, Process, Network, FileSystem
    private String severity; // Low, Medium, High, Critical
    private String source;
    private String username;
    private String ipAddress;
    private String action;
    
    @Column(length = 2000)
    private String payloadDetails;
    
    private String evidenceFileName;

    public ForensicEvent() {
    }

    public ForensicEvent(Long id, LocalDateTime timestamp, String eventType, String severity, String source, String username, String ipAddress, String action, String payloadDetails, String evidenceFileName) {
        this.id = id;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.severity = severity;
        this.source = source;
        this.username = username;
        this.ipAddress = ipAddress;
        this.action = action;
        this.payloadDetails = payloadDetails;
        this.evidenceFileName = evidenceFileName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getEventType() { return eventType; }
    public void setEventType(String eventType) { this.eventType = eventType; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public String getPayloadDetails() { return payloadDetails; }
    public void setPayloadDetails(String payloadDetails) { this.payloadDetails = payloadDetails; }

    public String getEvidenceFileName() { return evidenceFileName; }
    public void setEvidenceFileName(String evidenceFileName) { this.evidenceFileName = evidenceFileName; }
}
