package com.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Medicine;
import com.hospital.repository.MedicineRepositories;

@Service
public class MedicineServiceImpl implements MedicineService {
	
	@Autowired
	private MedicineRepositories mediRepo;
	
	@Override
	public void saveOneMedicine(Medicine medicine) {
		mediRepo.save(medicine);
	}

	@Override
	public List<Medicine> getAllMedicine() {
		List<Medicine> findAll = mediRepo.findAll();
		return findAll;
	}

	@Override
	public Medicine getOneMedicine(int id) {
		Optional<Medicine> findById = mediRepo.findById(id);
		Medicine medicine = findById.get();
		return medicine;
	}

	@Override
	public void updateMedicine(Medicine medi) {
		mediRepo.save(medi);
		
	}

	@Override
	public void deleteOneMedicine(int id) {
		
		mediRepo.deleteById(id);
	}
	

}
