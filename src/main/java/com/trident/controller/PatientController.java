package com.trident.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.trident.entity.Patient;
import com.trident.service.PatientService;

@CrossOrigin
@Controller
@RequestMapping("/patient")
public class PatientController 
{
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<Patient> findAll(Model model)
	{
		List<Patient> patient = patientService.findAll();
		return patient;
	}
	
	@RequestMapping(value="/find/{aadhar}", method = RequestMethod.GET)
	@ResponseBody
	public Patient find(@PathVariable("aadhar") String aadhar)
	{
		return patientService.findById(aadhar);
	}
	
	@RequestMapping(value="/delete/{aadhar}", method = RequestMethod.GET)
	@ResponseBody
	public List<Patient> remove(@PathVariable("aadhar") String aadhar)
	{
		Patient patient = patientService.findById(aadhar);
		patientService.remove(patient);
		return patientService.findAll();
	}
	
	@PostMapping("/save")
	@ResponseBody
	public String save(@RequestBody Patient thePatient)
	{
		patientService.save(thePatient);
		return "sucess";
	}
	
}
