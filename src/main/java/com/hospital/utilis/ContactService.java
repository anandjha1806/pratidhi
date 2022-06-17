package com.hospital.utilis;

import java.util.List;

import com.hospital.entities.Contact;

public interface ContactService {

	void saveOneContact(Contact contact);

	List<Contact> getAllContact();

}
