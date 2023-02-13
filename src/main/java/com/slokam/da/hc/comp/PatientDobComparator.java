package com.slokam.da.hc.comp;

import java.util.Comparator;

import com.slokam.da.hc.entity.Patient;

public class PatientDobComparator implements Comparator<Patient>{

	  @Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getPdob().compareTo(o2.getPdob());
	}
}
