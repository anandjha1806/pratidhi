package com.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Receptionist;
import com.hospital.repository.ReceptionistRepositories;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {
	
	@Autowired
	private ReceptionistRepositories recepRepo;

	@Override
	public void saveOneReceptionist(Receptionist receptionist) {
		
		recepRepo.save(receptionist);
	}

	@Override
	public List<Receptionist> getAllReceptionist() {
		List<Receptionist> findAll = recepRepo.findAll();
		return findAll;
	}

	@Override
	public Receptionist getOneReceptionist(int id) {
		Optional<Receptionist> findById = recepRepo.findById(id);
		Receptionist receptionist = findById.get();
		return receptionist;
	}

	@Override
	public void deleteOneReceptionist(int id) {
		recepRepo.deleteById(id);		
	}
}
