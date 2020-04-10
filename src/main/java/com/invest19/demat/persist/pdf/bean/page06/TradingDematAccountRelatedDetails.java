package com.invest19.demat.persist.pdf.bean.page06;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.invest19.demat.persist.pdf.bean.page07.AdditionalDetails;
import com.invest19.demat.persist.pdf.bean.page07.TradingDeclaration;
import com.invest19.demat.persist.pdf.bean.page07.ForOfficeUseOnly;
import com.invest19.demat.persist.pdf.bean.page07.IntroducerDeatails;
import com.invest19.demat.persist.pdf.bean.page08.PartB;

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
	private TradingDeclaration tradingDeclaration;

	@Embedded
	private ForOfficeUseOnly forOfficeUseOnly;

	private PartB partB;

}
