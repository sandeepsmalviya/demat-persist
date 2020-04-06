package com.invest19.demat.persist.pdf.bean.page4;

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
public class IdentityDetails {

	private String fullName;
	private String fatherSpouseName;
	private String maidenName;
	private String motherName;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@Enumerated(EnumType.STRING)
	private Citizenship citizenship;
	
	private String countryCode;
	private Date dateOfBirth;
	
	@Enumerated(EnumType.STRING)
	private ResidentialStatus residentialStatus;
	
	private String panNumber;
	private String aadharNumber;	
	private boolean proofOfIdentitySubmittedForPANExemptUid;
	private boolean proofOfIdentitySubmittedForPANExemptPassport;
	private boolean proofOfIdentitySubmittedForPANExemptVoterId;
	private boolean proofOfIdentitySubmittedForPANExemptDrivingLicence;	
	private boolean proofOfIdentitySubmittedForPANExemptOhers;	
	private boolean proofOfIdentitySubmittedForPANExemptNregaJob;
	private String proofOfIdentitySubmittedForPANExemptOthers;
	private String nregaJob;
	
	
	public enum Gender {
		MALE, FEMALE, T_TRANSGENDER
	}
	
	
	public enum MaritalStatus {
		MARRIED, UNMARRIED, OTHERS
	}

	public enum Citizenship {
		IN_INDIAN, OTHERS
	}

	
	public enum ResidentialStatus {
		RESIDENT_INDIVIDUAL, NON_RESIDENT_INDIAN, FOREIGN_NATIONAL, PERSON_OF_INDIAN_ORIGIN
	}
}
