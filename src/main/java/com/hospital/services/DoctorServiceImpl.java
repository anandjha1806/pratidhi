package com.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Doctor;
import com.hospital.repository.DoctorRepositories;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepositories doctorRepo;
	
	@Override
	public void saveOneDoctor(Doctor doctor) {
		doctorRepo.save(doctor);
	}

	@Override
	public List<Doctor> findAllDoctor() {
		List<Doctor> findAll = doctorRepo.findAll();
		return findAll;
	}

	@Override
	public Doctor getDoctorInfo(int docId) {
		Optional<Doctor> findById = doctorRepo.findById(docId);
		Doctor doctor = findById.get();
		return doctor;
	}

	@Override
	public void deleteOneDoctor(int id) {
		doctorRepo.deleteById(id);
		
	}

	@Override
	public Doctor getDoctorDetail(String doctorName) {
		Doctor name = doctorRepo.getDoctorByName(doctorName);
		return name;
	}

}
