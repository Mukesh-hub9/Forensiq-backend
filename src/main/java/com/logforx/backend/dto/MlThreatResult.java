package com.logforx.backend.dto;

public class MlThreatResult {
    private String threatKey;
    private String threatType;
    private String severity;
    private double confidence;
    private String mitreTechnique;
    private String description;
    private String detectionSource;

    public MlThreatResult() {}

    public MlThreatResult(String threatKey, String threatType, String severity, double confidence,
                           String mitreTechnique, String description, String detectionSource) {
        this.threatKey = threatKey;
        this.threatType = threatType;
        this.severity = severity;
        this.confidence = confidence;
        this.mitreTechnique = mitreTechnique;
        this.description = description;
        this.detectionSource = detectionSource;
    }

    public String getThreatKey() { return threatKey; }
    public void setThreatKey(String threatKey) { this.threatKey = threatKey; }

    public String getThreatType() { return threatType; }
    public void setThreatType(String threatType) { this.threatType = threatType; }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }

    public double getConfidence() { return confidence; }
    public void setConfidence(double confidence) { this.confidence = confidence; }

    public String getMitreTechnique() { return mitreTechnique; }
    public void setMitreTechnique(String mitreTechnique) { this.mitreTechnique = mitreTechnique; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDetectionSource() { return detectionSource; }
    public void setDetectionSource(String detectionSource) { this.detectionSource = detectionSource; }
}
