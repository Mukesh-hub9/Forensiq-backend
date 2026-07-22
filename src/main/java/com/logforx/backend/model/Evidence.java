package com.logforx.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Evidence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String fileName;
    private String hash;
    private LocalDateTime uploadTimestamp;
    private String fileType;
    private String status; // UPLOADING, PARSED, FAILED
    private String investigatorId;
    private Long fileSize;

    public Evidence() {
    }

    public Evidence(Long id, String fileName, String hash, LocalDateTime uploadTimestamp, String fileType, String status, String investigatorId, Long fileSize) {
        this.id = id;
        this.fileName = fileName;
        this.hash = hash;
        this.uploadTimestamp = uploadTimestamp;
        this.fileType = fileType;
        this.status = status;
        this.investigatorId = investigatorId;
        this.fileSize = fileSize;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getHash() { return hash; }
    public void setHash(String hash) { this.hash = hash; }

    public LocalDateTime getUploadTimestamp() { return uploadTimestamp; }
    public void setUploadTimestamp(LocalDateTime uploadTimestamp) { this.uploadTimestamp = uploadTimestamp; }

    public String getFileType() { return fileType; }
    public void setFileType(String fileType) { this.fileType = fileType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getInvestigatorId() { return investigatorId; }
    public void setInvestigatorId(String investigatorId) { this.investigatorId = investigatorId; }

    public Long getFileSize() { return fileSize; }
    public void setFileSize(Long fileSize) { this.fileSize = fileSize; }
}
