package com.cmed.prescriptionmanagement.controller;

import com.cmed.prescriptionmanagement.model.Prescription;
import com.cmed.prescriptionmanagement.repository.PrescriptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping(value="/api/v1/prescriptions")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PrescriptionManagementController {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionManagementController(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    @GetMapping()
    public ResponseEntity<?>  findAll(@RequestParam(value = "prescriptionDate", required = false)
                                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                                                  LocalDate prescriptionDate) {
        if (prescriptionDate != null) {
            return ResponseEntity.ok(prescriptionRepository.findAllByPrescriptionDate(prescriptionDate));
        }
    return ResponseEntity.ok(prescriptionRepository.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<?>  findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(prescriptionRepository.findById(id).get());
    }

    @PostMapping()
    public ResponseEntity<?>  cretePrescription(@Valid @RequestBody Prescription prescription) {
        return ResponseEntity.ok( prescriptionRepository.save(prescription));
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Void>  updatePrescription(@PathVariable(name = "id") Long id,@Valid @RequestBody Prescription prescription) {
        prescriptionRepository.save(prescription);
        return status(ACCEPTED).build();
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void>   deletePrescription(@PathVariable("id") Long id) {
        prescriptionRepository.deleteById(id);
        return status(ACCEPTED).build();
    }

}
