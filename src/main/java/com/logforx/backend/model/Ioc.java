package com.logforx.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ioc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String type; // IP, Domain, URL, Hash
    
    @Column(name = "ioc_value")
    private String value;
    
    private String description;
    private String threatSource;

    public Ioc() {
    }

    public Ioc(Long id, String type, String value, String description, String threatSource) {
        this.id = id;
        this.type = type;
        this.value = value;
        this.description = description;
        this.threatSource = threatSource;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getThreatSource() { return threatSource; }
    public void setThreatSource(String threatSource) { this.threatSource = threatSource; }
}
