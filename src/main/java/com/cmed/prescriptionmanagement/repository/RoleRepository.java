package com.cmed.prescriptionmanagement.repository;

import com.cmed.prescriptionmanagement.model.ERole;
import com.cmed.prescriptionmanagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}