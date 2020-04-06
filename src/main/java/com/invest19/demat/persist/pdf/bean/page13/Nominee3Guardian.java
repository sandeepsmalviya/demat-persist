package com.invest19.demat.persist.pdf.bean.page13;

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
public class Nominee3Guardian {

	private String nominee3GuardianFirstName;
	private String nominee3GuardianMiddleName;
	private String nominee3GuradianLastName;
	private String nominee3GuradianAddress;
	private String nominee3GuradianCity;
	private String nominee3GuradianState;
	private String nominee3GuradianCountry;
	private String nominee3GuradianPinCode;
	private Integer nominee3GuradianAge;
	
	private String nominee3GuradianTelephoneNumber;
	private String nominee3GuradianFaxNumber;
	private String nominee3GuradianEmailId;
	
	
	private String nominee3GuradianRelationshipWithNominee;
	
	
}
