package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Bill;

public interface BillRepositories extends JpaRepository<Bill, Long> {

}
