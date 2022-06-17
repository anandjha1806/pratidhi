package com.hospital.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.entities.Bill;
import com.hospital.services.BillService;
import com.hospital.utilis.PdfGen;
import com.hospital.utilis.PdfGenerator;


@Controller

public class BillController {
	
	@Autowired
	private BillService billService;
	static long billno;
	
	@Autowired
	private PdfGenerator pdf;
	
	@Autowired
	private PdfGen pdff;
	
	@RequestMapping("/generateBill")
	public String viewBill(@ModelAttribute() Bill bill,ModelMap model) {
		billService.safeNewBill(bill);
		billno = bill.getBillNo();
		Bill bills = billService.getNewBill(billno);
		
		// pdf.writeUsingIText(bills);
		
		pdff.writeUsingIText(bills);
		
		
		 model.addAttribute("msg","Bill downloaded");
		return "receptionist_dashboard";
	}
	
	
	
}
