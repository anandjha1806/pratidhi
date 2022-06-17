package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.entities.Medicine;
import com.hospital.services.MedicineService;

@Controller
public class MedicineController {
	@Autowired
	private MedicineService medService;
	
	@RequestMapping("/addMedicine")
	public String addMedicine() {
		return "register_medicine";
	}
	
	@RequestMapping("/addNewMedicine")
	public String addNewMedicine(@ModelAttribute() Medicine medicine, ModelMap model) {
		medService.saveOneMedicine(medicine);
		model.addAttribute("msg","Medicial data saved");
		return "pharmacist_dashboard";
	}
	
	@RequestMapping("viewAllMedicine")
	public String viewAllMedicine(ModelMap model) {
		List<Medicine> medicine = medService.getAllMedicine();
		model.addAttribute("medicine", medicine);
		return "view_all_medicine";
	}
	
	@RequestMapping("viewMedicine")
	public String viewMedicine(@RequestParam("id") int id,ModelMap model) {
		Medicine medicine = medService.getOneMedicine(id);
		 model.addAttribute("medicine",medicine);
		return "view_medicine";
	}
	
	@RequestMapping("/updateMedicine")
	public String updateMedicine(@ModelAttribute() Medicine medi ,ModelMap model) {
		medService.updateMedicine(medi);
		List<Medicine> medicine = medService.getAllMedicine();
		model.addAttribute("medicine", medicine);
		return "view_all_medicine";
	}
	
	@RequestMapping("/deleteMedicine")
	public String deleteMedicine(@RequestParam("id") int id,ModelMap model) {
		medService.deleteOneMedicine(id);
		
		List<Medicine> medicine = medService.getAllMedicine();
		model.addAttribute("medicine", medicine);
		return "view_all_medicine";
	}
}
