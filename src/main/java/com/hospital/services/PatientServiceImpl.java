package com.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Patient;
import com.hospital.repository.PatientRepositories;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepositories patientRepo;
	@Override
	public void addNewPatient(Patient patient) {
		patientRepo.save(patient);
	}
	@Override
	public List<Patient> getAllPatient() {
		List<Patient> all = patientRepo.findAll();
		return all;
	}
	@Override
	public Patient getPatientInfo(long id) {
		Optional<Patient> findById = patientRepo.findById(id);
		Patient patient = findById.get();
		return patient;
	}
	@Override
	public void updateOnePatient(Patient pat) {
		
		patientRepo.save(pat);
	}

}
