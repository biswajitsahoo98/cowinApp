package com.trident.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT_DETAILS")
public class Patient 
{
	@Id
	@Column(name="AADHAR")
	private String aadhar;
	
	@Column
	private String name;
	
	@Column
	private String blood_group;
	
	@Column
	private String gender;
	
	@Column
	private String dob;
	
	@Column
	private String marital;
	
	@Column
	private String category;
	
	@Column
	private String contact;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private String contact_no;
	
	@Column
	private String email_id;
	
	@Column
	private String e_address;
	
	@Column
	private String insurance_no;
	
	@Column
	private String insurance_pro;
	
	@Column
	private String vaccine_type;
	
	@Column
	private String vaccine_batch_no;
	
	@Column
	private String dose_1;
	
	@Column
	private String dose_2;
	
	public String getVaccine_type() {
		return vaccine_type;
	}

	public void setVaccine_type(String vaccine_type) {
		this.vaccine_type = vaccine_type;
	}

	public String getVaccine_batch_no() {
		return vaccine_batch_no;
	}

	public void setVaccine_batch_no(String vaccine_batch_no) {
		this.vaccine_batch_no = vaccine_batch_no;
	}

	public String getDose_1() {
		return dose_1;
	}

	public void setDose_1(String dose_1) {
		this.dose_1 = dose_1;
	}

	public String getDose_2() {
		return dose_2;
	}

	public void setDose_2(String dose_2) {
		this.dose_2 = dose_2;
	}

	@OneToMany(mappedBy="patients", cascade = CascadeType.ALL, orphanRemoval=true)
	@OrderBy("patientKey.sequence")
	private List<History> history;

	public Patient(){
		
	}
	
	public List<History> getHistory() {
		return history;
	}

	public void setHistory(List<History> history) {
		this.history = history;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAadhar() {
		return aadhar;
	}



	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}



	public String getBlood_group() {
		return blood_group;
	}



	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getMarital() {
		return marital;
	}



	public void setMarital(String marital) {
		this.marital = marital;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContact_no() {
		return contact_no;
	}



	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}



	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

	public String getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}

	public String getInsurance_pro() {
		return insurance_pro;
	}

	public void setInsurance_pro(String insurance_pro) {
		this.insurance_pro = insurance_pro;
	}

	@Override
	public String toString() {
		return "Patient [aadhar=" + aadhar + ", name=" + name + "]";
	}
}
