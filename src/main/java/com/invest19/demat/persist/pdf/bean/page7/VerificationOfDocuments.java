package com.invest19.demat.persist.pdf.bean.page7;

import java.sql.Date;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class VerificationOfDocuments {

	private String documentsVerifiedBy;
	private String verificationOfDocumentsEmployeeDesignation;
	private Date verificationOfDocumentsOnDate;
	private String verificationOfDocumentsEmployeeCode;

}
