package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Receptionist;

public interface ReceptionistRepositories extends JpaRepository<Receptionist, Integer> {

}
