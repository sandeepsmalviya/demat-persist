package com.invest19.demat.persist.pdf.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.invest19.demat.persist.pdf.bean.page13.NominationDetails;
import com.invest19.demat.persist.pdf.bean.page15.TariffSheet;
import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorney;
import com.invest19.demat.persist.pdf.bean.page18.AcknowledgementLetter;
import com.invest19.demat.persist.pdf.bean.page4.KycApplicationForm;
import com.invest19.demat.persist.pdf.bean.page5.AdditionalKycForm;
import com.invest19.demat.persist.pdf.bean.page6.TradingDematAccountRelatedDetails;
import com.invest19.demat.persist.pdf.bean.page9.LetterForAuthorization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PdfApplicationForm {

	@Id
	private String userId;

	@Embedded
	private KycApplicationForm kycApplicationForm;

	@Embedded
	private AdditionalKycForm additionalKycForm;

	@Embedded
	private TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails;

	@Embedded
	private LetterForAuthorization letterForAuthorization;
	@Embedded
	private NominationDetails nominationDetails;

	@Embedded
	private TariffSheet tariffSheet;

	@Embedded
	private PowerOfAttorney powerOfAttorney;

	@Embedded
	private AcknowledgementLetter acknowledgementLetter;

}
