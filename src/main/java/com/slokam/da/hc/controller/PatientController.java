package com.slokam.da.hc.controller;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.da.hc.DTO.PatientDTO;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.mapper.Iservicemapper;
import com.slokam.da.hc.services.IPatientService;

@RestController
@RequestMapping("patient")
public class PatientController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
	@Autowired
	private IPatientService patientService;
	
	@PostMapping("saves")
	public void savepatient(@RequestBody PatientDTO patient) throws PatientException{
		LOGGER.debug("Entered into savePatient");
		
//		LOGGER.debug("Exit from  savePatient");
		 patientService.savePatient(patient);
	}
	
	 @GetMapping("/doctors/{pname}")
	 public ResponseEntity<List<String>> getDoctorNamesByPatientName(@PathVariable(name="pname") String name) throws PatientException{
		    LOGGER.debug("Entered into getDoctorNamesByPatientName");
			List<String> doctorNames = patientService.getDoctorNamesByPatientName(name); 
			ResponseEntity<List<String>> re =
					new ResponseEntity<List<String>>(doctorNames,HttpStatus.OK );
			LOGGER.debug("Exit from  getDoctorNamesByPatientName");
			return re;
	 }
	 @GetMapping("/all/{sortBy}")
	 public ResponseEntity<List<Patient>> getAllPatients(@PathVariable String sortBy) throws PatientException {
		  LOGGER.debug("Entered into List<Patient>");
		  List<Patient>  list = patientService.getAllPatients(sortBy);
		  ResponseEntity<List<Patient>> re =
					new ResponseEntity<List<Patient>>(list,HttpStatus.OK );
			LOGGER.debug("Exit from  List<Patient>");
			return re;
	 }
	 @GetMapping("getbyid/{id}")
	 public PatientDTO getpatientdtobyid(@PathVariable Integer id) throws PatientException {
		 
		return patientService.getPatientById(id);
		 
	 }
}
