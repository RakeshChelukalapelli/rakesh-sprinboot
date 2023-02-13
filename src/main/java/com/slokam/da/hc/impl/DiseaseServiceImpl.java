package com.slokam.da.hc.impl;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.da.hc.dao.DiseaseDAO;
import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.exceptions.PatientException;
import com.slokam.da.hc.services.DiseaseService;
@Service
public class DiseaseServiceImpl implements DiseaseService{
	private static Logger LOGGER = LoggerFactory.getLogger(DiseaseServiceImpl.class);
	@Autowired
	private DiseaseDAO diseaseDAO;
	
	
	@Override
	public void addDisease(Disease disease) throws PatientException {
		LOGGER.debug("Entered into addDisease");
		try {
			if(disease!=null) {
				LOGGER.debug("Disease Details::"+disease);
				Disease existingDisease = diseaseDAO.findByName(disease.getName());
				LOGGER.debug("Existing Disease Details with provided name::"+disease);
				if(existingDisease !=null){
					LOGGER.debug("Disease name existed allready::");
					throw new PatientException("Disease Name allready existed.");
				}
				else{
					LOGGER.debug("Saving desease details");
				    diseaseDAO.save(disease);
				}
			}
		} catch (PatientException e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PatientException("DB problem", e);
		}
		LOGGER.debug("Exit from addDisease");
	}
	
}
