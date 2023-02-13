package com.slokam.da.hc.services;

import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.exceptions.PatientException;

public interface DiseaseService {
	public abstract void addDisease(Disease disease) throws PatientException;
}
