package org.airbnb.javaweb_hospitalmanagementsystem.controllers;

import org.airbnb.javaweb_hospitalmanagementsystem.entities.Patient;
import org.airbnb.javaweb_hospitalmanagementsystem.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerPatients {
    @Autowired
    private PatientService _service;

    @GetMapping
    public String getPatients(Model model) {
        model.addAttribute("patients", _service.getAllPatients());
        model.addAttribute("patient", new Patient());
        return "listPatients";
    }

    @PostMapping("/create")
    public String createPatient(Patient patient) {
        _service.createPatient(patient);
        return "redirect:/";
    }
}
