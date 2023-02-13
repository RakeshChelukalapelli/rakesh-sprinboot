package com.slokam.da.hc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Visiting {
	@Id
	@GeneratedValue
	private Integer vid;
	private Date vtime;
	@OneToOne
	@JoinColumn(name="fkvid")
	private Doctor doctor;
	@OneToOne
	@JoinColumn(name="fkaid")
	private Appointment appointment;
	@OneToOne
	private Patient patient;
	
	
	
}
