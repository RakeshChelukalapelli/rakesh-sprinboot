package com.slokam.da.hc.comp;

import java.util.Comparator;

import com.slokam.da.hc.entity.Patient;

public class PatientPhoneComparator implements Comparator<Patient> {
@Override
public int compare(Patient o1, Patient o2) {
	return o1.getPphone().compareTo(o2.getPphone());
}
}
