package com.slokam.da.hc.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.da.hc.entity.Doctor;
import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.services.IDoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	private static Logger LOGGER = LoggerFactory.getLogger(DoctorController.class);
	@Autowired
	private IDoctorService doctorService;
	
	@PostMapping() 
	public ResponseEntity<String> save(@RequestBody Doctor doctor) throws PatientException{
		LOGGER.debug("Entered into save");
		ResponseEntity<String> re= null;
		if(doctor!=null){
			LOGGER.debug("doctor data"+doctor);
			doctorService.save(doctor);
			re = new ResponseEntity<String>(HttpStatus.CREATED);
		}else{
			re = new ResponseEntity<String>("null visiting",HttpStatus.BAD_REQUEST);
		}
		LOGGER.debug("Exit from save");
		return re;
	}
	
}
