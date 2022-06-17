package com.hospital.services;

import java.util.List;

import com.hospital.entities.Patient;

public interface PatientService {

	void addNewPatient(Patient patient);

	List<Patient> getAllPatient();

	Patient getPatientInfo(long id);

	void updateOnePatient(Patient pat); 

}
