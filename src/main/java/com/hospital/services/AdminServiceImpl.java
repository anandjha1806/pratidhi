package com.hospital.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Admin;
import com.hospital.repository.AdminRepositories;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepositories adminRepo;

	@Override
	public void addOneAdmin(Admin admin) {
		adminRepo.save(admin);
		
	}

	@Override
	public List<Admin> findallAdmin() {
		List<Admin> findAll = adminRepo.findAll();
		return findAll;
	}

	@Override
	public void deleteOneAdmin(int id) {
		adminRepo.deleteById(id);
		
	}

	@Override
	public Admin getAdmin(String email) {
		Admin admin = adminRepo.getAdminByEmail(email);
		return admin;
	}

	
}
