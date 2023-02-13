package com.slokam.da.hc.impl;

import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.da.hc.dao.IDoctorDAO;
import com.slokam.da.hc.dao.PatientDAO;
import com.slokam.da.hc.entity.Doctor;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.services.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService{
   private static Logger LOGGER = LoggerFactory.getLogger(DoctorServiceImpl.class); 
	@Autowired
	private IDoctorDAO doctorDAO;
	@Override
 	public void save(Doctor doctor)throws PatientException {
		
		LOGGER.debug("save start");
		try{
			doctorDAO.save(doctor);
		}catch(Exception e){
			e.printStackTrace();
			throw new PatientException("DB Problem",e);
		}
		
		LOGGER.debug("save end");
	}
	  
	
	
}
