package com.trident.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trident.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, String>
{
	@Query(value = "FROM PATIENT_DETAILS p where p.aadhar = ?1", nativeQuery = true)
	public Optional<Patient> findByAadhar(String aadhar);
}
