package com.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Pharmacist;
import com.hospital.repository.PharmacistRepositories;

@Service
public class PharmacistServiceImpl implements PharmacistService{
	
	@Autowired
	private PharmacistRepositories pharRepo;

	@Override
	public void saveNewPharmacist(Pharmacist pharmacist) {
		pharRepo.save(pharmacist);
		
	}

	@Override
	public List<Pharmacist> findallAdmin() {
		List<Pharmacist> phar = pharRepo.findAll();
		return phar;
	}

}
