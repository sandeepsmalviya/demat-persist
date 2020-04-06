package com.invest19.demat.persist.pdf.bean.page16;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Embeddable
public class PowerOfAttorneyAnnexureB {

	private String powerOfAttorneyAnnexureBOnThis;
	private String powerOfAttorneyAnnexureBDayOf;
	
	private String powerOfAttorneyAnnexureBWitness1Name;
	private String powerOfAttorneyAnnexureBWitness1Address;
	private String powerOfAttorneyAnnexureBWitness1Signature;

	private String powerOfAttorneyAnnexureBWitness2Name;
	private String powerOfAttorneyAnnexureBWitness2Address;
	private String powerOfAttorneyAnnexureBWitness2Signature;
}
