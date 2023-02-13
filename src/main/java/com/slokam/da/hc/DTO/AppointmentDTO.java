package com.slokam.da.hc.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDTO {
	private Integer aid;
	private Date ataken;
	private Date areqDate;
	private String acomments;

}
