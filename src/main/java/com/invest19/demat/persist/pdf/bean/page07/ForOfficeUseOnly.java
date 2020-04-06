package com.invest19.demat.persist.pdf.bean.page07;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class ForOfficeUseOnly {

	private String clientsUccCode;
	private String forOfficeUseOnlyEmployeeCode;
	private String forOfficeUseOnlyEmployeeDesignation;

	@Embedded
	private VerificationOfDocuments verificationOfDocuments;
	
	@Embedded
	private ClientsInterview clientsInterview;
	
	@Embedded
	private InPersonVerification inPersonVerification;
	
	private Date tradingOfficeuseDate;

}
