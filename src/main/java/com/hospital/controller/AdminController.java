package com.hospital.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Admin;
import com.hospital.services.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin_login";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin(@RequestParam("adminEmail") String email,@RequestParam("adminPassword") String password) {
		
		return "admin_dashboard";
	}
	
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "admin_dashboard";
	}
	
	@RequestMapping("/doctorRegistration")
	public String doctorRegistration() {
		return "doctor_registration";
	}
	
	@RequestMapping("/receptionistRregistration")
	public String receptionistRregistration() {
		return "receptionist_registration";
	}
	
	@RequestMapping("/adminRegistration")
	public String addRegistration() {
		return "admin_registration";
	}
	
	@RequestMapping("/pharmacistRegistration")
	public String addPharmacist() {
		return "pharmacist_registration";
	}
	
	
	@RequestMapping("/addAdmin")
	public String addAdmin(@ModelAttribute Admin admin,ModelMap model) {
		adminService.addOneAdmin(admin);
		
		model.addAttribute("msg", "One Admin Added");
		return "admin_dashboard";
	}
	
	
	@RequestMapping("/viewAllAdmin")
	public String viewAllAdmin(ModelMap model) {
		List<Admin> admin =adminService.findallAdmin();
		model.addAttribute("admin",admin);
		return "view_all_admin";
	}
	
	@RequestMapping("/deleteAdmin")
	public String deleteAdmin(@RequestParam("id") int id,ModelMap model) {
		adminService.deleteOneAdmin(id);
		
		List<Admin> admin =adminService.findallAdmin();
		model.addAttribute("admin",admin);
		return "view_all_admin";
	}
	
	
	
}







