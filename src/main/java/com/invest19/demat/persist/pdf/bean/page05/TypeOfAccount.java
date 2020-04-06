package com.invest19.demat.persist.pdf.bean.page05;

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

public class TypeOfAccount {

	@Enumerated(EnumType.STRING)
	private Type type;

	@Enumerated(EnumType.STRING)
	private Individual individual;
	private String individualOthers;

	@Enumerated(EnumType.STRING)
	private Nri nri;
	private String nriOthers;

	@Enumerated(EnumType.STRING)
	private ForeignNational foreignNational;
	private String ForeignNationalOthers;

	public enum Type {
		INDIVIDUAL, NRI, FORIGN_NATIONAL
	}

	public enum Individual {

		INDIVIDUAL_RESIDENT, INDIVIDUAL_DIRECTORS_RELATIVE_INDIVIDUAL, PROMOTER, INDIVIDUAL_MARGIN_TRADING_AC_MANTRA,
		INDIVIDUAL_DIRECTOR, INDIVIDUAL_HUF_AOP, MINOR, OTHERS
	}

	public enum Nri {

		NRI_REPATRIABLE, NRI_REPATRIABLE_PROMOTER, NRI_DEPOSITORY_RECEIPTS, NRI_NON_REPATRIABLE,
		NRI_NON_REPATRIABLE_PROMOTER, OTHERS
	}

	public enum ForeignNational {

		FORIGN_NATIONAL, FORIGN_NATIONAL_DEPOSITORY_RECEIPTS, OTHERS
	}

//	private String individualNriForeignNational;
//	private String individualDetails;
//	private String nriDetails;
//	private String foreignNationalDetails;

}
