package com.slokam.da.hc.impl;

import java.util.Collections;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.da.hc.DTO.PatientDTO;
import com.slokam.da.hc.comp.PatientComparator;
import com.slokam.da.hc.comp.PatientIdComparator;
import com.slokam.da.hc.dao.PatientDAO;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.mapper.Iservicemapper;
import com.slokam.da.hc.services.IPatientService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PatientServiceImpl implements IPatientService{
   private static Logger LOGGER = LoggerFactory.getLogger(PatientServiceImpl.class); 
	@Autowired
	private PatientDAO patientDAO;
	Iservicemapper mapper=Mappers.getMapper(Iservicemapper.class);
	
 	public void savePatient(PatientDTO patient)throws PatientException {
		Patient patientDto;
		log.debug("savePatient start");
		try{
			patientDto= mapper.patientdtotopatient(patient);
			patientDAO.save(patientDto);
		}catch(Exception e){
			e.printStackTrace();
			throw new PatientException("DB Problem",e);
		}
		
		
		log.debug("savePatient end");
	}
	  
	@Override
	public PatientDTO getPatientById(Integer id)throws PatientException {
		  log.debug("getPatientById start");
		   Patient p = null; 
		  try{
				Optional<Patient> optional = patientDAO.findById(id);
				if(optional.isPresent()){
					p = optional.get();
					
				}
			}catch(Exception e){
				e.printStackTrace();
				throw new PatientException("DB Problem",e);
			}
		  log.debug("getPatientById end");
		  
		return mapper.patienttopatientdao(p);
	}
	
	@Override
    public List<String> getDoctorNamesByPatientName(String name) throws PatientException{
		 log.debug("getDoctorNamesByPatientName start");
		 List<String> doctorNames=null;
		try {
			doctorNames = patientDAO.getDoctorNamesByPatientName(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new PatientException("Db issue",e);
		}
		 log.debug("getDoctorNamesByPatientName end");	
		 return doctorNames;
	}
	
	@Override
		public List<Patient> getAllPatients(String sortBy) throws PatientException {
		log.debug("getAllPatients start");
		 List<Patient> patientList = patientDAO.findAll();

		 Comparator<Patient> comparator = PatientComparator.getPatientComparator(sortBy);
		 Collections.sort(patientList,comparator);
		 log.debug("getAllPatients end");	
		return patientList;
		}
	
	
	public Patient getMaxAgePatient(){
		 Patient p = null;
		 log.debug("getMaxAgePatient start");
		 List<Patient> patientList = patientDAO.findAll();
		 for (Patient patient : patientList) {
			 if(p==null){
				 p = patient;
			 }else{
				 Date dob1  = patient.getPdob();
				 Date dob2  = p.getPdob();
				 if(dob1.after(dob2)){
					 p=patient;
				 }
			 }
			 
		 }
		 log.debug("getMaxAgePatient end");	
		 return p;
	}
}
