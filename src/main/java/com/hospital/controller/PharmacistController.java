package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.entities.Pharmacist;
import com.hospital.services.PharmacistService;

@Controller
public class PharmacistController {
	@Autowired
	private PharmacistService pharmacistService;
	
	@RequestMapping("/addPharmacist")
	public String addPharmacist(@ModelAttribute Pharmacist pharmacist, ModelMap model) {
		pharmacistService.saveNewPharmacist(pharmacist);
		
		model.addAttribute("msg", "One pharmacist added");
		return "admin_dashboard";
	}
	
	@RequestMapping("/viewAllPharmacist")
	public String viewAllAdmin(ModelMap model) {
		List<Pharmacist> pharmacist =pharmacistService.findallAdmin();
		model.addAttribute("pharmacist",pharmacist);
		return "view_all_pharmacist";
	}
}
