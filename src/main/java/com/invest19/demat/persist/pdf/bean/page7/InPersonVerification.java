package com.invest19.demat.persist.pdf.bean.page7;

import java.sql.Date;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
@Data
public class InPersonVerification {

	private String ipvPerformedBy;
	private String inPersonVerificationEmployeeDesignation;
	private Date inPersonVerificationOnDate;
	private String inPersonVerificationEmployeeCode;
}
