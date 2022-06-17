package com.hospital.utilis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.entities.Contact;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contactSend")
	public String saveContact(@ModelAttribute Contact contact,ModelMap model) {
		contactService.saveOneContact(contact);
		
		model.addAttribute("msg","We will contact you shortly");
		return "contact";
	}
}
