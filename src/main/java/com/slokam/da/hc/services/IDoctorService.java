package com.slokam.da.hc.services;

import com.slokam.da.hc.entity.Doctor;

import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exceptions.PatientException;


public interface IDoctorService {
	public void save(Doctor doctor) throws PatientException;
}
