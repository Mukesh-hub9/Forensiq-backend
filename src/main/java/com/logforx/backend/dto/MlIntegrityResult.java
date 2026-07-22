package com.logforx.backend.dto;

public class MlIntegrityResult {
    private String prediction;
    private double passScore;
    private double failScore;
    private String source;

    public MlIntegrityResult() {}

    public MlIntegrityResult(String prediction, double passScore, double failScore, String source) {
        this.prediction = prediction;
        this.passScore = passScore;
        this.failScore = failScore;
        this.source = source;
    }

    public String getPrediction() { return prediction; }
    public void setPrediction(String prediction) { this.prediction = prediction; }

    public double getPassScore() { return passScore; }
    public void setPassScore(double passScore) { this.passScore = passScore; }

    public double getFailScore() { return failScore; }
    public void setFailScore(double failScore) { this.failScore = failScore; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
}
