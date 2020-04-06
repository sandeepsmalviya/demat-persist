package com.invest19.demat.persist.pdf.bean.page04;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.Valid;

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
	@Valid
	private IdentityDetails identityDetails; // 20

	@Embedded
	@Valid
	private AddressDetails addressDetails; // 20

	@Embedded
	@Valid
	private Declaration declaration; // 9

}
