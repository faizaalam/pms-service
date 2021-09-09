package com.cmed.prescriptionmanagement.controller;

import com.cmed.prescriptionmanagement.model.Prescription;
import com.cmed.prescriptionmanagement.repository.PrescriptionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value="/prescription")
@CrossOrigin(origins = "http://localhost:4200")
public class PrescriptionManagementController {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionManagementController(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @GetMapping()
    List<Prescription> findAll() {
        return prescriptionRepository.findAll();
    }

    @PostMapping()
    Prescription cretePrescription(@RequestBody Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    @PutMapping(value="/{id}")
    void updatePrescription(@PathVariable(name = "id") Long id, @RequestBody Prescription prescription) {
        prescriptionRepository.save(prescription);
    }

    @DeleteMapping()
    void deletePrescription(@PathVariable("id") Long id) {
        prescriptionRepository.deleteById(id);
    }

}
