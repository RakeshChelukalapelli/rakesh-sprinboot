package com.slokam.da.hc.mapper;

import org.mapstruct.Mapper;

import com.slokam.da.hc.DTO.AppointmentDTO;
import com.slokam.da.hc.DTO.DiseaseDTO;
import com.slokam.da.hc.DTO.DoctorDTO;
import com.slokam.da.hc.DTO.PatientDTO;
import com.slokam.da.hc.DTO.VisitingDTO;
import com.slokam.da.hc.dao.AppointmentDAO;
import com.slokam.da.hc.dao.DiseaseDAO;
import com.slokam.da.hc.dao.IDoctorDAO;
import com.slokam.da.hc.dao.PatientDAO;
import com.slokam.da.hc.entity.Appointment;
import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.entity.Doctor;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.entity.Visiting;
@Mapper
public interface Iservicemapper {
	Patient patientdtotopatient(PatientDTO patientdto);
	PatientDTO patienttopatientdao(Patient patient);
	Disease diseasedaotodisease(DiseaseDTO diseasedto);
	DiseaseDTO diseasetodiseasedao(Disease disease);
	Appointment appointmentdaotoappointmant(AppointmentDTO appointmentdto);
	AppointmentDTO appointmenttoappointmentdao(Appointment appointment);
	Doctor doctordaotodoctor(DoctorDTO doctorDTO);
	DoctorDTO doctortodoctordto(Doctor doctor);
	Visiting visitingdtotovisting(VisitingDTO visitingdto);
	VisitingDTO visitingtovisitingdto(Visiting visiting);
	PatientDTO getpatientdtobyid(Integer id);
	Patient patientdaotopatient(PatientDTO patientdto);
 
}
