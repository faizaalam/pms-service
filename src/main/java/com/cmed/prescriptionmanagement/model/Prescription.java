package com.cmed.prescriptionmanagement.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

@Entity
public class Prescription {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate prescriptionDate;
    @NotNull
    private String name;
    @NotNull
    @Positive
    private Integer age;
    @NotNull
    private Gender gender;
    private String diagnosis;
    @NotNull
    private String prescribedMedicine;
    private  LocalDate visitDate;

    public Long getId() {
        return id;
    }

    public Prescription setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getPrescriptionDate() {
        return prescriptionDate;
    }

    public Prescription setPrescriptionDate(LocalDate prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public Prescription setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Prescription setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Prescription setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public Prescription setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public Prescription setPrescribedMedicine(String prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
        return this;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public Prescription setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
        return this;
    }
}
