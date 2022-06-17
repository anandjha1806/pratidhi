package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Patient;

public interface PatientRepositories extends JpaRepository<Patient, Long> {

}
