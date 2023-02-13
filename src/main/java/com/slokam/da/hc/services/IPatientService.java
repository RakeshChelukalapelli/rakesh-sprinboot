package com.slokam.da.hc.services;

import java.util.List;

import com.slokam.da.hc.DTO.PatientDTO;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exceptions.PatientException;

public interface IPatientService {

	 public List<Patient> getAllPatients(String sortBy) throws PatientException;
	 public void savePatient(PatientDTO patient) throws PatientException;
	 public PatientDTO getPatientById(Integer id) throws PatientException;
	 public abstract List<String> getDoctorNamesByPatientName(String name)throws PatientException;
}
