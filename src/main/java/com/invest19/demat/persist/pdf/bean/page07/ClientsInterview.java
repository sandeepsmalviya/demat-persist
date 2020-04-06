package com.invest19.demat.persist.pdf.bean.page07;

import java.sql.Date;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class ClientsInterview {

	private String clientInterviewedBy;
	private String clientInterviewEmployeeDesignation;
	private Date clientInterviewDate;
	private String clientsInterviewEmployeeCode;
}
