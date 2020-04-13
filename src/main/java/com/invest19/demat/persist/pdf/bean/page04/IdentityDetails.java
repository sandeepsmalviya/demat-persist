package com.invest19.demat.persist.pdf.bean.page04;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

	@NotEmpty(message = "fullName can not be empty")
	private String fullName;

	@NotEmpty(message = "fatherSpouseName can not be empty")
	private String fatherSpouseName;

	@NotEmpty(message = "maidenName can not be empty")
	private String maidenName;

	@NotEmpty(message = "motherName can not be empty")
	private String motherName;

	@Enumerated(EnumType.STRING)
	@NotNull(message = "gender can not be null")
	private Gender gender;


	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@Enumerated(EnumType.STRING)
	private Citizenship citizenship;

	@NotEmpty(message = "countryCode can not be empty")
	private String countryCode;

	private Date dateOfBirth;

	@Enumerated(EnumType.STRING)
	private ResidentialStatus residentialStatus;

	@NotNull(message = "PanNumber can not be null")
	@NotEmpty(message = "PanNumber can not be empty")
	@Size(min = 10, max = 10, message = "PAN Number must be equal to 10 characters")
	private String panNumber;

	@NotNull(message = "AadharNumber can not be null")
	@NotEmpty(message = "AadharNumber can not be empty")
	@Size(min = 12, max = 12, message = "Aadhar Number must be equal to 12 characters")
	private String aadharNumber;

//	private boolean proofOfIdentitySubmittedForPANExemptUid;
//	private boolean proofOfIdentitySubmittedForPANExemptPassport;
//	private boolean proofOfIdentitySubmittedForPANExemptVoterId;
//	private boolean proofOfIdentitySubmittedForPANExemptDrivingLicence;
//	private boolean proofOfIdentitySubmittedForPANExemptOhers;
//	
//	private String proofOfIdentitySubmittedForPANExemptOthers;
//	
	
	
	@Enumerated(EnumType.STRING)
	private ProofOfIdentity proofOfIdentity;
	
	private String proofOfIdentityOthers;
	
	
	private boolean nregaJob;
	private String nregaJobString;
	
	
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
	
	
	public enum ProofOfIdentity {

		UID_AADHAR, PASSPORT, VOTER_ID, DRIVING_LICENSE, OTHERS 
	}


}
