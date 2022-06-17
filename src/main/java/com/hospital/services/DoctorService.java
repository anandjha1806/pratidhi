package com.hospital.services;

import java.util.List;

import com.hospital.entities.Doctor;

public interface DoctorService {

	void saveOneDoctor(Doctor doctor);

	List<Doctor> findAllDoctor();

	Doctor getDoctorInfo(int docId);

	void deleteOneDoctor(int id);

	Doctor getDoctorDetail(String doctorName);


}
