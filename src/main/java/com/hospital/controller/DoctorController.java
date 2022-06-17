package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Doctor;
import com.hospital.entities.Medicine;
import com.hospital.entities.Patient;
import com.hospital.services.DoctorService;
import com.hospital.services.MedicineService;
import com.hospital.services.PatientService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private MedicineService mediService;
	
	
	@RequestMapping("/addDoctor")
	public String addDoctor(@ModelAttribute Doctor doctor,ModelMap model) {
		doctorService.saveOneDoctor(doctor);
		model.addAttribute("msg","One Doctor Saved");
		return "admin_dashboard";
	}
	
	
	@RequestMapping("/viewAllDoctor")
	public String viewAllDoctor(ModelMap model) {
		List<Doctor> doctor=doctorService.findAllDoctor();
		model.addAttribute("doctor",  doctor);
		return "view_all_doctor";
	}
	
	@RequestMapping("/viewDoctor")
	public String viewDoctor(@RequestParam("id") int id, ModelMap model) {
		Doctor doctor = doctorService.getDoctorInfo(id);
		model.addAttribute("doctor",doctor);
		return "view_doctor";
	}
	
	@RequestMapping("deleteDoc")
	public String deleteDoctor(@RequestParam("id") int id, ModelMap model) {
		doctorService.deleteOneDoctor(id);
		
		List<Doctor> doctor=doctorService.findAllDoctor();
		model.addAttribute("doctor",  doctor);
		return "view_all_doctor";
	}
	
	@RequestMapping("updateDoc")
	public String updateDoc(@ModelAttribute() Doctor doc,ModelMap model ) {
		doctorService.saveOneDoctor(doc);
		
		List<Doctor> doctor=doctorService.findAllDoctor();
		model.addAttribute("doctor",  doctor);
		return "view_all_doctor";
	}
	
	@RequestMapping("/doctorLoggedIn")
	public String doctorLoggedIn(ModelMap model){
		List<Patient> patient = patientService.getAllPatient();
		 model.addAttribute("patient",patient);
		
		return "doctor_dashboard";
	}
	
	@RequestMapping("/viewDoctorPatient")
	public String viewDoctorPatient(@RequestParam("id") long id,ModelMap model) {
		
		Patient patient = patientService.getPatientInfo(id);
		model.addAttribute("patient",patient);
	
		List<Medicine> medi = mediService.getAllMedicine();
		model.addAttribute("medi", medi);
		
		return "view_doctor_patient";
	}
	
	
}
