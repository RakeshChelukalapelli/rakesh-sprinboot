package com.slokam.da.hc.impl;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.da.hc.dao.AppointmentDAO;
import com.slokam.da.hc.entity.Appointment;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.services.IAppointmentService;
@Service
public class AppointmentServiceImpl implements IAppointmentService{
	private static Logger LOGGER = LoggerFactory.getLogger(AppointmentServiceImpl.class);
	@Autowired
	private AppointmentDAO appointDao;
	
	@Override
	public void createAppointment(Appointment appointment) throws PatientException {
		LOGGER.debug("Entered into createAppointment");
		
		try {
			if(appointment!=null) {
				appointment.setAtaken(new Date());
				LOGGER.debug("Appointment Details::"+appointment);
				appointDao.save(appointment);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PatientException("DB problem", e);
		}
		LOGGER.debug("Exit from createAppointment");
	}
	
}
