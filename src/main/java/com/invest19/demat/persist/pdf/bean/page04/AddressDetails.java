package com.invest19.demat.persist.pdf.bean.page04;

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
public class AddressDetails {

	@Enumerated(EnumType.STRING)
	private AddressType addressType;

	private String addressForResidenceCorrespondence;
	private String cityTownVillage;
	private String pinCode;
	private String state;
	private String country;
	private String telephoneOffice;
	private String telephoneResidential;
	private String mobile;
	private String fax;
	private String emailAddress;

	private String permanantAdrressIfDifferent;
	private String cityTownVillage2;
	private String pinCode2;
	private String state2;
	private String country2;

	@Enumerated(EnumType.STRING)
	private ProofOfAddress proofOfAddress;

	private String proofOfAddressOthers;
	private Date addressDate;
	private String anyOtherInformation;
	
	public enum AddressType {
		RESIDENTIAL_BUSINESS, RESIDENTIAL, BUSINESS, REGISTERED_OFFICE, UNSPECIFIED
	}
	
	public enum ProofOfAddress {
		PASSPORT, 
		RATION_CARD,
		REGISTERED_LEASE_SALE_AGREEMENT_OF_RESIDENCE,
		DRIVING_LICENCE,
		VOTER_IDENTITY_CARD,
		LATEST_BANK_ACCOUNT_STATEMENT_PASSBOOK,
		LATEST_TELEPHONE_BILL_ONLY_LANDLINE,
		LATEST_ELECTRICITY_BILL,
		LATEST_GAS_BILL,
		OTHERS
	}

}
