package com.slokam.da.hc.comp;

import java.util.Comparator;

import com.slokam.da.hc.entity.Patient;

public class PatientComparator {

	public static Comparator<Patient> getPatientComparator(String sortBy){
		Comparator<Patient> comparator=null;
		switch(sortBy){
			case "id": comparator = new PatientIdComparator() ;break;
			case "name": comparator= new PatientNameComparator();break;
			case "dob": comparator = new PatientDobComparator(); break;
case "id": comparator = new PatientIdComparator() ;break;
			case "phone": comparator = new PatientPhoneComparator();break;
			default: comparator = new PatientIdComparator();
		}
		return comparator;
	}
}
