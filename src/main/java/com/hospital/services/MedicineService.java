package com.hospital.services;

import java.util.List;

import com.hospital.entities.Medicine;

public interface MedicineService {

	void saveOneMedicine(Medicine medicine);

	List<Medicine> getAllMedicine();

	Medicine getOneMedicine(int id);

	void updateMedicine(Medicine medi);

	void deleteOneMedicine(int id);

}
