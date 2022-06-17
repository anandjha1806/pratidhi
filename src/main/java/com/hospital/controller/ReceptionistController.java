package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Contact;
import com.hospital.entities.Doctor;
import com.hospital.entities.Receptionist;
import com.hospital.services.DoctorService;
import com.hospital.services.ReceptionistService;
import com.hospital.utilis.ContactService;

@Controller
public class ReceptionistController {
	

	@Autowired
	private ReceptionistService recepService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/addReceptionist")
	public String saveReceptionist(@ModelAttribute Receptionist receptionist, ModelMap model) {
		recepService.saveOneReceptionist(receptionist);
		model.addAttribute("msg", "One Receptionist Added");
		return "admin_dashboard";
	}
	@RequestMapping("/viewAllReceptionist")
	public String viewAllReceptionist(ModelMap model) {
		List<Receptionist> receptionist = recepService.getAllReceptionist();
		model.addAttribute("receptionist",receptionist);
		return "view_all_Receptionist";
	}
	
	@RequestMapping("/addPatient")
	public String addPatient(ModelMap model) {
		
		List<Doctor> doctor = doctorService.findAllDoctor();
		model.addAttribute("doctor",doctor);
		return "patient_registration";
	}
	
	@RequestMapping("/viewAllQuery")
	public String viewAllQuery(ModelMap model) {
		List<Contact> contact = contactService.getAllContact();
		model.addAttribute("contact",contact);
		
		return "view_all_query";
	}
	
	@RequestMapping("/viewReceptionist")
	public String viewReceptionist(@RequestParam("id") int id,ModelMap model ) {
		Receptionist recep = recepService.getOneReceptionist(id);
		model.addAttribute("recep", recep);
		return "view_receptionist";
	}
	
	@RequestMapping("/deleteRec")
	public String delteOneReceptionist(@RequestParam("id") int id,ModelMap model) {
		recepService.deleteOneReceptionist(id);
		
		List<Receptionist> receptionist = recepService.getAllReceptionist();
		model.addAttribute("receptionist",receptionist);
		return "view_all_Receptionist";
	}
	
	@RequestMapping("/updateRec")
	public String updateRec(@ModelAttribute() Receptionist recept,ModelMap model) {
		recepService.saveOneReceptionist(recept);
		
		List<Receptionist> receptionist = recepService.getAllReceptionist();
		model.addAttribute("receptionist",receptionist);
		return "view_all_Receptionist";
	}
	
		
}
