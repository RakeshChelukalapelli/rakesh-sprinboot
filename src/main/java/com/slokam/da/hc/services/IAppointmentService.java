package com.slokam.da.hc.services;

import com.slokam.da.hc.entity.Appointment;
import com.slokam.da.hc.exceptions.PatientException;



public interface IAppointmentService {
	public abstract void createAppointment(Appointment appointment) throws PatientException;
}
