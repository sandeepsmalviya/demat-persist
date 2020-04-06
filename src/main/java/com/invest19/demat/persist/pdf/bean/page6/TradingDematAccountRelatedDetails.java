package com.invest19.demat.persist.pdf.bean.page6;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.invest19.demat.persist.pdf.bean.page7.AdditionalDetails;
import com.invest19.demat.persist.pdf.bean.page7.Declaration;
import com.invest19.demat.persist.pdf.bean.page7.ForOfficeUseOnly;
import com.invest19.demat.persist.pdf.bean.page7.IntroducerDeatails;
import com.invest19.demat.persist.pdf.bean.page8.PartB;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class TradingDematAccountRelatedDetails {

	@Embedded
	private PrimaryBankingAccount primaryBankingAccount;

	@Embedded
	private PrimaryDepositoryAccount primaryDepositoryAccount;

	@Embedded
	private TradingPreferences tradingPreferences;

	@Embedded
	private PastActions pastActions;

	@Embedded
	private DealingsThroughOtherMembers dealingsThroughOtherMembers;

	@Embedded
	private DetailsOfRelatedPerson detailsOfRelatedPerson;

	@Embedded
	private AdditionalDetails additionalDetails;

	@Embedded
	private IntroducerDeatails introducerDeatails;

	@Embedded
	private Declaration declaration;

	@Embedded
	private ForOfficeUseOnly forOfficeUseOnly;

	private PartB partB;

}
