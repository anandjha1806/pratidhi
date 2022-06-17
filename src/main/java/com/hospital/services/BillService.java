package com.hospital.services;


import java.util.List;

import com.hospital.entities.Bill;

public interface BillService {

	void safeNewBill(Bill bill);

	Bill getNewBill(long billno);

	List<Bill> getNewBills(Long billno);

	

}
