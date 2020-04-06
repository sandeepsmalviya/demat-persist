package com.invest19.demat.persist.pdf.bean.page16;

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
public class PowerOfAttorney {

	private String powerOfAttorneyFirstHolderName;
	private String powerOfAttorneySecondHolderName;
	private String powerOfAttorneyThirdHolderName;

	private String powerOfAttorneyDpId;
	private String powerOfAttorneyClientId;
	
	@Embedded
	private PowerOfAttorneyAnnexureB powerOfAttorneyAnnexureB;

}
