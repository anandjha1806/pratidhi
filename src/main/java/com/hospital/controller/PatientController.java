package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Doctor;
import com.hospital.entities.Patient;
import com.hospital.services.DoctorService;
import com.hospital.services.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DoctorService doctorService;

	@RequestMapping("/addNewPatient")
	public String addPatient(@ModelAttribute Patient patient,ModelMap model) {
		patientService.addNewPatient(patient);
		model.addAttribute("msg","Patient added");
		return "receptionist_dashboard";
	}
	
	@RequestMapping("/viewAllPatient")
	public String viewAllPatient(ModelMap model) {
		
		List<Patient> patient = patientService.getAllPatient();
		 model.addAttribute("patient",patient );
		return "view_all_patient";
	}
	
	@RequestMapping("/viewPatient")
	public String viewPatient(@RequestParam("id") long id,ModelMap model) {
		Patient patient = patientService.getPatientInfo(id);
		model.addAttribute("patient",patient);
		return "view_patient";
	}
	
	@RequestMapping("/updatePatient")
	public String updatePatient(@ModelAttribute() Patient pat,ModelMap model) {
		
		patientService.updateOnePatient(pat);
		List<Patient> patient = patientService.getAllPatient();
		 model.addAttribute("patient",patient);
		
		return "doctor_dashboard";
	}
	
	//billing page
	
	@RequestMapping("/viewPatientforBill")
	public String viewPatientforBill(@RequestParam("id") long id,ModelMap model) {
	Patient patient = patientService.getPatientInfo(id);
	String doctorName = patient.getAssignDoctor();
	Doctor doctor = doctorService.getDoctorDetail(doctorName);
	model.addAttribute("doctor", doctor);
	model.addAttribute("patient",patient);
	return "view_patient";
	}
}
