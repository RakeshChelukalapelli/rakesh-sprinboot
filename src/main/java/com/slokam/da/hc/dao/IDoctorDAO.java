package com.slokam.da.hc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.da.hc.entity.Doctor;
@Repository
public interface IDoctorDAO  extends JpaRepository<Doctor, Integer>{

}
