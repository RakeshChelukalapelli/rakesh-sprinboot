package com.slokam.da.hc.services;

import com.slokam.da.hc.exceptions.PatientException;

public interface IDataImportService {
	public void importData(String filePath) throws  PatientException;
}
