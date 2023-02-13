package com.slokam.da.hc.controller;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.entity.Doctor;
import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.services.DiseaseService;

@RestController
@RequestMapping("disease")
public class DiseaseController {
	private static Logger LOGGER = LoggerFactory.getLogger(DiseaseController.class);
	@Autowired
	private DiseaseService diseaseService;
	
	@PostMapping() 
	public ResponseEntity<String> save( @Valid @RequestBody Disease disease) throws PatientException{
		LOGGER.debug("Entered into save");
		ResponseEntity<String> re= null;
		if(disease!=null){
			LOGGER.debug("doctor data"+disease);
			diseaseService.addDisease(disease);
			re = new ResponseEntity<String>(HttpStatus.CREATED);
		}else{
			re = new ResponseEntity<String>("null Disease",HttpStatus.BAD_REQUEST);
		}
		LOGGER.debug("Exit from save");
		return re;
	}
	
}
