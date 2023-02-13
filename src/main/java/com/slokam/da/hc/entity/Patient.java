package com.slokam.da.hc.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
public class Patient {
	
	
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	private Date pdob;
	private Long pphone;
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable(name="patdoc",joinColumns = @JoinColumn(name="pid"),inverseJoinColumns = @JoinColumn(name="did"))
	private List<Doctor> doctor;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="patdis",joinColumns = @JoinColumn(name="pid"),inverseJoinColumns = @JoinColumn(name="deid"))
	private List<Disease> disease;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fkpid")
	private Visiting visiting;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "patient")
	private Appointment appointment;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(appointment, other.appointment) && Objects.equals(disease, other.disease)
				&& Objects.equals(doctor, other.doctor) && Objects.equals(pdob, other.pdob)
				&& Objects.equals(pid, other.pid) && Objects.equals(pname, other.pname)
				&& Objects.equals(pphone, other.pphone) && Objects.equals(visiting, other.visiting);
	}
	@Override
	public int hashCode() {
		return Objects.hash(appointment, disease, doctor, pdob, pid, pname, pphone, visiting);
	}
	
}
