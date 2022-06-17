package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Medicine;

public interface MedicineRepositories extends JpaRepository<Medicine, Integer> {

}
