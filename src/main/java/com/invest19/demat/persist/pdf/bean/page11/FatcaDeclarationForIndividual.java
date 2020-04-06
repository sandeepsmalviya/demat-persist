package com.invest19.demat.persist.pdf.bean.page11;

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
public class FatcaDeclarationForIndividual {

	private String fdfiNameOfAccountHolder1;

	@Enumerated(EnumType.STRING)
	private FdfiCitizenship fdfiCitizenship1;
	private String fdfiCityOfBirthCountryOfBirth1;
	private String fdfiCountriesOtherThanIndia1;
	private String fdfiTaxIdentificationNumberOrEquivalent1;

	@Enumerated(EnumType.STRING)
	private FdfiSourceOfWealth fdfiSourceOfWealth1;

	private String fdfiNameOfAccountHolder2;

	@Enumerated(EnumType.STRING)
	private FdfiCitizenship fdfiCitizenship2;
	private String fdfiCityOfBirthCountryOfBirth2;
	private String fdfiCountriesOtherThanIndia2;
	private String fdfiTaxIdentificationNumberOrEquivalent2;

	@Enumerated(EnumType.STRING)
	private FdfiSourceOfWealth fdfiSourceOfWealth2;

	private String fdfiNameOfAccountHolder3;

	@Enumerated(EnumType.STRING)
	private FdfiCitizenship fdfiCitizenship3;
	private String fdfiCityOfBirthCountryOfBirth3;
	private String fdfiCountriesOtherThanIndia3;
	private String fdfiTaxIdentificationNumberOrEquivalent3;

	@Enumerated(EnumType.STRING)
	private FdfiSourceOfWealth fdfiSourceOfWealth3;

	public enum FdfiCitizenship {
		INDIA, USA, OTHERS
	}

	public enum FdfiSourceOfWealth {
		SALARY, GITFT, ROYALTY, PRIZE_MONEY, BUSINESS, RENTAL_INCOME,
	}

}
