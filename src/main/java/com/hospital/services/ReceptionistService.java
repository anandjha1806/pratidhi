package com.hospital.services;

import java.util.List;

import com.hospital.entities.Receptionist;

public interface ReceptionistService {

	void saveOneReceptionist(Receptionist receptionist);

	List<Receptionist> getAllReceptionist();

	Receptionist getOneReceptionist(int id);

	void deleteOneReceptionist(int id);

}
