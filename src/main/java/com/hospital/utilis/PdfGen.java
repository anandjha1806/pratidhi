package com.hospital.utilis;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hospital.entities.Bill;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Component
public class PdfGen {

	public void writeUsingIText(Bill bill) {
    	long billNo = bill.getBillNo();
    	String patientFirstName = bill.getPatientFirstName();
    	String patientLastName = bill.getPatientLastName();
    	String disease = bill.getDisease();
    	int age = bill.getAge();
    	String gender = bill.getGender();
    	Date billDate = bill.getBillDate();
    	int fees = bill.getFees();
    	String doctorFirstName = bill.getDoctorFirstName();
    	String doctorLastName = bill.getDoctorLastName();
    	String medicine = bill.getMedicine();
    	
    	try {
    		
    		JasperReport jasperReport = JasperCompileManager.compileReport("D:\\sts\\hospital\\report.jrxml");
    		JRDataSource dataSource = new JREmptyDataSource();
    		
    		Map<String,Object> parameter = new HashMap<String,Object>();
    		parameter.put("patientFirstName",patientFirstName);
    		parameter.put("patientLastName",patientLastName);
    		parameter.put("disease",disease);
    		parameter.put("age",age);
    		parameter.put("gender",gender);
    		parameter.put("billDate",billDate);
    		parameter.put("fees",fees);
    		parameter.put("doctorFirstName",doctorFirstName);
    		parameter.put("doctorLastName",doctorLastName);
    		parameter.put("medicine",medicine);
    		parameter.put("billNo",billNo);
    		
    		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter,dataSource);
    		
    		JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\new\\report"+billNo+".pdf");
    		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
	}
}
