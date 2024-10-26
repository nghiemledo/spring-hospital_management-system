package org.airbnb.javaweb_hospitalmanagementsystem.DAOLayer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.airbnb.javaweb_hospitalmanagementsystem.entities.Patient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class PatientDAO {
    @PersistenceContext
    private EntityManager _context;

    public void createPatient(Patient patient) {
        _context.persist(patient);
    }

    public List<Patient> getAllPatients() {
        return _context.createQuery("from Patient", Patient.class).getResultList();
    }
}
