package com.cmed.prescriptionmanagement.repository;

import com.cmed.prescriptionmanagement.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
