package com.slokam.da.hc.DTO;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseDTO {
	private Integer deid;
	private String dename;
	private String diseaseCode;

}
