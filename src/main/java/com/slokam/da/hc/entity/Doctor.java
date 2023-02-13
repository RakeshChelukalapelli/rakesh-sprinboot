package com.slokam.da.hc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Doctor {

	@Id
	@GeneratedValue
	private Integer did;
	private String dname;
	private String dspeci;
//	@ManyToMany
//	@JoinTable(name="docpat")
	@ManyToMany
	private List<Patient> parient;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkdid")
	private Appointment appointment;
	@OneToOne(cascade = CascadeType.ALL)
	
	private Disease disease;
	@OneToOne(cascade = CascadeType.ALL)
	private Visiting visiting;
	
	
		
	
}
