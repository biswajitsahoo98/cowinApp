package com.trident.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PatientKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PatientKey() {
		
	}

	public PatientKey(String aadhar, String sequence) {
		super();
		this.aadhar = aadhar;
		this.sequence = sequence;
	}

	@Column(name="AADHAR")
	private String aadhar;

	@Column(name="SEQUENCE")
	private String sequence;
	
	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}
