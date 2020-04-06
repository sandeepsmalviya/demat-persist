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
public class Nominee2Guardian {

	private String nominee2GuardianFirstName;
	private String nominee2GuardianMiddleName;
	private String nominee2GuradianLastName;
	private String nominee2GuradianAddress;
	private String nominee2GuradianCity;
	private String nominee2GuradianState;
	private String nominee2GuradianCountry;
	private String nominee2GuradianPinCode;
	private Integer nominee2GuradianAge;
	
	private String nominee2GuradianTelephoneNumber;
	private String nominee2GuradianFaxNumber;
	private String nominee2GuradianEmailId;
	
	
	private String nominee2GuradianRelationshipWithNominee;
	
}
