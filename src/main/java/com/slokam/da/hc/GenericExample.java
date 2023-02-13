package com.slokam.da.hc;

import java.util.ArrayList;
import java.util.List;

import com.slokam.da.hc.entity.Doctor;

public class GenericExample {
  
	public static void main(String[] args) {
	    // List<String>
	    List<Doctor> l = test();
	    for(int i =0; i<l.size();i++){
	    	  Doctor obj = l.get(i);
	    	  // Doctor obj = (Doctor)l.get(i)
	    	  System.out.println(obj.getDname());
	    }
	    
	}
	
	public static List<Doctor> test(){
		   Doctor d1 = new Doctor();
		   d1.setDname("A");
		   d1.setDspeci("A1");
		   Doctor d2 = new Doctor();
		   d2.setDname("A");
		   d2.setDspeci("A1");
		   Doctor d3 = new Doctor();
		   d3.setDname("A");
		   d3.setDspeci("A1");
		   
		   List<Doctor> list  = new ArrayList<>();
		   
		   list.add(d1);
		   list.add(d2);
		   list.add(d3);
		   
		  
		   return list;
	}
}
