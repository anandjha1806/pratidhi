package com.hospital.services;


import java.util.List;

import com.hospital.entities.Admin;

public interface AdminService {

	void addOneAdmin(Admin admin);

	List<Admin> findallAdmin();

	void deleteOneAdmin(int id);

	Admin getAdmin(String email);




}

