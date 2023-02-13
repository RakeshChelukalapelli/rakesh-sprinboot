package com.slokam.da.hc.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Appointment {
	
	@Id
	@GeneratedValue
	private Integer aid;
	private Date ataken;
	private Date areqDate;
	private String acomments;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkaid")
	private Patient patient;
	@OneToOne
	private Doctor doctor;
	@OneToOne
	private Visiting visiting;
	
	
		
	
}
