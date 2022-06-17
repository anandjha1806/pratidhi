package com.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entities.Bill;
import com.hospital.repository.BillRepositories;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepositories billRepo;
	@Override
	public void safeNewBill(Bill bill) {
		billRepo.save(bill);
	}
	
	@Override
	public Bill getNewBill(long billno) {
		Optional<Bill> findById = billRepo.findById(billno);
		Bill bill = findById.get();
		return bill;
	}

	@Override
	public List<Bill> getNewBills(Long billno) {
		Optional<Bill> findById = billRepo.findById(billno);
		Bill bill = findById.get();
		return (List<Bill>) bill;
	}
	
}
