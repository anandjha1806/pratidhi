package com.hospital.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Bill {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long billNo;
		private String patientFirstName;
		private String patientLastName;
		private int age;
		private String gender;
		private String disease;
		
		@CreationTimestamp
		@Temporal(TemporalType.DATE)
		private Date billDate;
		private String medicine;
		private String patientId;
		private String doctorFirstName;
		private String doctorLastName;
		private int doctorId;
		private int fees;
		
		
		public Long getBillNo() {
			return billNo;
		}
		public void setBillNo(Long billNo) {
			this.billNo = billNo;
		}
		public String getPatientFirstName() {
			return patientFirstName;
		}
		public void setPatientFirstName(String patientFirstName) {
			this.patientFirstName = patientFirstName;
		}
		public String getPatientLastName() {
			return patientLastName;
		}
		public void setPatientLastName(String patientLastName) {
			this.patientLastName = patientLastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
		public Date getBillDate() {
			return billDate;
		}
		public void setBillDate(Date billDate) {
			this.billDate = billDate;
		}
		public String getMedicine() {
			return medicine;
		}
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}
		public String getPatientId() {
			return patientId;
		}
		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}
		public String getDoctorFirstName() {
			return doctorFirstName;
		}
		public void setDoctorFirstName(String doctorFirstName) {
			this.doctorFirstName = doctorFirstName;
		}
		public String getDoctorLastName() {
			return doctorLastName;
		}
		public void setDoctorLastName(String doctorLastName) {
			this.doctorLastName = doctorLastName;
		}
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}

		
		
}
