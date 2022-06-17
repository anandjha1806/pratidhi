package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospital.entities.Admin;

public interface AdminRepositories extends JpaRepository<Admin, Integer> {

	@Query("SELECT u FROM Admin u WHERE u.adminEmail = ?1")
	public Admin getAdminByEmail(String email);
}
