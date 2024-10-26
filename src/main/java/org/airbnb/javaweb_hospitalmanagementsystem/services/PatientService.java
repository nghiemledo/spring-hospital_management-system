package org.airbnb.javaweb_hospitalmanagementsystem.services;

import org.airbnb.javaweb_hospitalmanagementsystem.DAOLayer.PatientDAO;
import org.airbnb.javaweb_hospitalmanagementsystem.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientDAO patientDAO;

    public void createPatient(Patient patient) {
        patientDAO.createPatient(patient);
    }

    public List<Patient> getAllPatients() {
        return patientDAO.getAllPatients();
    }
}
