package com.hospital.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Admin;
import com.hospital.services.AdminService;




@Controller
public class MainPageController {
	
	@Autowired
	private AdminService adminService;

	@RequestMapping("/")
	public String viewMainPage() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String viewAboutPage() {
		return "about";
	}
	
	@RequestMapping("/contact")
	public String viewContactPage() {
		return "contact";
	}
	@RequestMapping("/login")
	public String viewLoginPage() {
		return "login";
	}
	
	@RequestMapping("/adminLoggedIn")
	public String adminLoggedIn(@RequestParam("adminEmail") String email,@RequestParam("adminPassword") String password, ModelMap model) {
		Admin admin = adminService.getAdmin(email);
		
		if(admin!=null) {
			if(admin.getAdminEmail().equals(email) && admin.getAdminPassword().equals(password)) {
				return "admin_dashboard";
			}
			model.addAttribute("msg","user email/passowrd is wrong");
		}
		return "login";
	}
	
	@RequestMapping("/receptionistloggedIn")
	public String receptionistIn(ModelMap model) {
		
		
		return "receptionist_dashboard";
	}
	
	@RequestMapping("/pharmacistloggedIn")
	public String pharmacistloggedIn() {
		return "pharmacist_dashboard";
	}
	
	
}
