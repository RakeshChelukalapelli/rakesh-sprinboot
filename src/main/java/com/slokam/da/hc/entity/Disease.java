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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.engine.internal.Cascade;
import org.hibernate.validator.constraints.Length;

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

public class Disease {

	@Id
	@GeneratedValue
	private Integer deid;
	
	@Length(min=4,max=10)
	private String name;
	@Pattern(regexp="^DD[A-Z]+$")
	private String diseaseCode;
	@OneToOne
	@JoinColumn(name="fkdeid")
	private Doctor doctor;
	@ManyToMany
	private List<Patient> patient;
	
	
	
	
		
}
