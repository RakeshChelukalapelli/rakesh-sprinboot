package com.slokam.da.hc.services;

import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exceptions.PatientException;

public interface IVisitingService {
	public void visit(Visiting visiting) throws PatientException;
}
