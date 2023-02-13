package com.slokam.da.hc.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
	private Integer pid;
	private String pname;
	private Date pdob;
	private Long pphone;
}
