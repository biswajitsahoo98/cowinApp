package com.trident.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trident.entity.Patient;
import com.trident.repository.PatientRepository;

@Service
public class PatientService
{
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> findAll() {
		return patientRepository.findAll();
	}
	
	public Patient findById(String aadhar) {
		return patientRepository.findById(aadhar).get();
	}
	
	@Transactional
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}
	
	@Transactional
	public void remove(Patient patient) {
		patientRepository.delete(patient);
	}
}
