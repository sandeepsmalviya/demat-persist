package com.invest19.demat.persist.pdf.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.invest19.demat.persist.pdf.bean.page04.KycApplicationForm;
import com.invest19.demat.persist.pdf.bean.page05.AdditionalKycForm;
import com.invest19.demat.persist.pdf.bean.page06.TradingDematAccountRelatedDetails;
import com.invest19.demat.persist.pdf.bean.page09.LetterForAuthorization;
import com.invest19.demat.persist.pdf.bean.page13.NominationDetails;
import com.invest19.demat.persist.pdf.bean.page15.TariffSheet;
import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorney;
import com.invest19.demat.persist.pdf.bean.page18.AcknowledgementLetter;

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
	@NotNull(message = "UserId can not be null")
	@NotEmpty(message = "userId can not be empty")
	private String userId;

	@Embedded
	@Valid
	private KycApplicationForm kycApplicationForm;

	@Embedded
	@Valid
	private AdditionalKycForm additionalKycForm;

	@Embedded
	@Valid
	private TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails;

	@Embedded
	@Valid
	private LetterForAuthorization letterForAuthorization;
	@Embedded
	@Valid
	private NominationDetails nominationDetails;

	@Embedded
	@Valid
	private TariffSheet tariffSheet;

	@Embedded
	@Valid
	private PowerOfAttorney powerOfAttorney;

	@Embedded
	@Valid
	private AcknowledgementLetter acknowledgementLetter;

}
