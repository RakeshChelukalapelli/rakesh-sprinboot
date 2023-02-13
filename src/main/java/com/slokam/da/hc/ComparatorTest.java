package com.slokam.da.hc;

import java.io.Serializable;
import java.util.Comparator;

import com.slokam.da.hc.entity.Patient;


public class ComparatorTest implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Patient p1 = (Patient)o1;
		Patient p2 =(Patient)o2;
		return p1.getPdob().compareTo(p2.getPdob());
	}
}

class ComparatorTest2 implements Comparator<Patient>{
	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getPdob().compareTo(o2.getPdob());
	}
	
}
class sertest implements Serializable{
	
}