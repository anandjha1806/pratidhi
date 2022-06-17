package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Pharmacist;

public interface PharmacistRepositories extends JpaRepository<Pharmacist, Integer> {

}
