package com.invest19.demat.persist.pdf.bean.page06;

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

public class PrimaryBankingAccount {

	private String bankName;
	private String branchName;
	private String branchAddress;
	private String primaryBankingAccountCityTownVillage;
	private String primaryBankingAccountPincode;
	private String primaryBankingAccountState;
	private String primaryBankingAccountCountry;
	private String accountNumber;
	private String micrNumber;
	private String ifscCode;
	private String primaryBankingAccountTypeOthersPleaseSpecify;
	
	@Enumerated(EnumType.STRING)
	private AccountType primaryBankingAccountType;

	public enum AccountType {
		CURRENT, SAVINGS, NRI_NRE_NRO, OTHERS
	}

	// private String beneficiaryId;

}
