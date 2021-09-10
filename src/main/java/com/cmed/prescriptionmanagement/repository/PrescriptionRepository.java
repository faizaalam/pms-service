package com.cmed.prescriptionmanagement.repository;

import com.cmed.prescriptionmanagement.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
  List<Prescription> findAllByPrescriptionDate(LocalDate prescriptionDate);
}
