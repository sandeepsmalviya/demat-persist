package com.invest19.demat.persist.pdf.bean.page10;

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
public class OtherDetails {

	@Enumerated(EnumType.STRING)
	private OtherDetailsGrossAnnulaIncomeDetails otherDetailsGrossAnnulaIncomeDetails;
	private String otherDetailsNetWorthValue;
	private Date otherDetailsDate;
	
	@Enumerated(EnumType.STRING)
	private OtherDetailsForNonIndividuals otherDetailsForNonIndividuals;
	private boolean OtherDetailsSService;
	private boolean OtherDetailsOOthers;
	private boolean OtherDetailsBBusiness;
	
	@Enumerated(EnumType.STRING)
	private OtherDetailsService otherDetailsService;
	
	@Enumerated(EnumType.STRING)
	private OtherDetailsOthers othersDetailsOthers;
	
	@Enumerated(EnumType.STRING)
	private OtherDetailsBusiness otherDetailsBusiness;
	
	@Enumerated(EnumType.STRING)
	private OtherDetailsAffiliations otherDetailsAffiliations;
	
	
	private String otherDetailsAnyOtherInformation;

	public enum OtherDetailsGrossAnnulaIncomeDetails {
		UP_TO_1_LAC, RS_1_LAC_TO_5_LAC, RS_5_LAC_TO_10_LAC, RS_10_LAC_TO_25_LAC, MORE_THAN_25_LAC
	}

	public enum OtherDetailsForNonIndividuals {

		RS_25_LAC_TO_1_CRORE, OVER_1_CRORE
	}

	public enum OtherDetailsService {
		PRIVATE_SECTOR, PUBLIC_SECTOR, GOVERNMENT_SECTOR
	}

	public enum OtherDetailsOthers {
		PROFESSIONAL, SELF_EMPLOYED, RETIRED, HOUSEWIFE, STUDENT
	}

	public enum OtherDetailsBusiness {
		X_NON_CATEGORIZED, AGRICULTURE
	}

	public enum OtherDetailsAffiliations {
		POLITICALLY_EXPOSED_PERSON, RELATED_TO_A_POLITICALLY_EXPOSED_PERSON,
	}

}
