package org.airbnb.javaweb_hospitalmanagementsystem.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private String symptom;
    private int medicalId;

    public Patient() {}

    public Patient(String fullName, String symptom, int medicalId) {
        this.fullName = fullName;
        this.symptom = symptom;
        this.medicalId = medicalId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(int medicalId) {
        this.medicalId = medicalId;
    }
}
