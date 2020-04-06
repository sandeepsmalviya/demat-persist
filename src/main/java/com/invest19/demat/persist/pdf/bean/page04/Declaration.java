package com.invest19.demat.persist.pdf.bean.page04;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class Declaration {

	private String place;
	private Date declarationDate;
	private boolean ipvDone;
	private Date ipvDoneOnDate;

	private boolean originalsVerifiedTrueCopies;
	private boolean attestedTrueCopies;
	
	@Enumerated(EnumType.STRING)
	private ApplicationType applicationType;

	private String kycNumber;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;


	public enum ApplicationType {
		NEW, UPDATE
	}

	public enum AccountType {
		NORMAL, SMALL, SIMPLIFIED
	}

}
