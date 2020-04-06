package com.invest19.demat.persist.pdf.bean.page05;

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
public class AdditionalKycForm {

	@Embedded
	private DepositoryParticipant depositoryParticipant; //5
	
	@Embedded
	private TypeOfAccount typeOfAccount; //7

	@Embedded
	private HolderDetails holderDetails; //10
	
	@Embedded
	private DetailsOfGuardian detailsOfGuardian; //10

}
