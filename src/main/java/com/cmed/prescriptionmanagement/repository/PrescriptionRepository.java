package com.cmed.prescriptionmanagement.repository;

import com.cmed.prescriptionmanagement.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
  List<Prescription> findAllByPrescriptionDateBetween(LocalDate fromDate , LocalDate toDate);

  List<Prescription>  findAllByPrescriptionDate(LocalDate reportDate);


  @Query("select e from Prescription e where month(e.prescriptionDate) >= ?1 or month(e.prescriptionDate) <= ?2")
  List<Prescription> findAllBetweenMonths(int fromMonth, int toMonth);
}


