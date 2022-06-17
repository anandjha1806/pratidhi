package com.hospital.services;

import java.util.List;

import com.hospital.entities.Pharmacist;

public interface PharmacistService {

	void saveNewPharmacist(Pharmacist pharmacist);

	List<Pharmacist> findallAdmin();

}
