package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.entities.Doctor;

@Repository
public interface DoctorRepositories extends JpaRepository<Doctor, Integer> {

	@Query("SELECT u FROM Doctor u WHERE u.firstName = ?1")
	public Doctor getDoctorByName(String name);
}
