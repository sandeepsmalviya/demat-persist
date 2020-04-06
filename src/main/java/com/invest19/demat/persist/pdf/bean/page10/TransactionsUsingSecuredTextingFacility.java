package com.invest19.demat.persist.pdf.bean.page10;

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
public class TransactionsUsingSecuredTextingFacility {

	@Enumerated(EnumType.STRING)
	private TustfReadTermsAndConditions tustfReadTermsAndConditions;

	public enum TustfReadTermsAndConditions {
		YES, NO
	}

	private String tustfStockExchangeNameId1;
	private String tustfStockExchangeNameId2;

	private String tustfClearingMemberName1;
	private String tustfClearingMemberName2;

	private String tustfClearingMemberId1;
	private String tustfClearingMemberId2;

}
