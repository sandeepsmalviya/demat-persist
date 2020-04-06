package com.invest19.demat.persist.pdf.bean.page13;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.invest19.demat.persist.pdf.bean.page14.NominationDetailsDeclaration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class NominationDetails {

	private String nominationDetailsBioId;
	private String nominationDetailsRegistrationNumber;
	private String nominationDetailsPlace;
	private Date nominationDetailsDate;

	@Enumerated(EnumType.STRING)
	private NominationDetailsHereByDeclare nominationDetailsHereByDeclare;

	public enum NominationDetailsHereByDeclare {
		OPTION_FIRST, OPTION_SECOND
	}

	@Embedded
	private Nominee1 nominationDetailsNominee1;
	
	@Embedded
	private Nominee2 nominationDetailsNominee2;
	
	@Embedded
	private Nominee3 nominationDetailsNominee3;

	private String nominationDetailsWitnessName;
	private String nominationDetailsWitnessAddress;

	private String nominationDetailsFirstHolderName;
	private String nominationDetailsSecondHolderName;
	private String nominationDetailsThirdHolderName;


	private NominationDetailsDeclaration nominationDetailsDeclaration;

}
