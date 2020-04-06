package com.invest19.demat.persist.pdf.bean.page4;

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
public class KycApplicationForm {

	@Embedded
	private IdentityDetails identityDetails; //20
	
	@Embedded
	private AddressDetails addressDetails; //20
	
	@Embedded
	private Declaration declaration; //9

}
