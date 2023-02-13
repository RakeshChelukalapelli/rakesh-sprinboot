package com.slokam.da.hc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.da.hc.entity.Appointment;

@Repository
public interface AppointmentDAO extends JpaRepository<Appointment, Integer>{
  
	 
	 
}
