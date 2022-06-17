package com.hospital.utilis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Contact;
import com.hospital.repository.ContactRepositories;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepositories contactRepo;

	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> find = contactRepo.findAll();
		return find;
	}

	

}
