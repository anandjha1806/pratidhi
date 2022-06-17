package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entities.Contact;

public interface ContactRepositories extends JpaRepository<Contact, Long> {

}
