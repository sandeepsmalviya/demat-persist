package com.invest19.demat.persist.pdf.bean.page09;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.invest19.demat.persist.pdf.bean.page10.Easi;
import com.invest19.demat.persist.pdf.bean.page10.OptionFormForIssueOfDisBooklet;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails;
import com.invest19.demat.persist.pdf.bean.page10.SmsAlertFacility;
import com.invest19.demat.persist.pdf.bean.page10.TransactionsUsingSecuredTextingFacility;
import com.invest19.demat.persist.pdf.bean.page11.FatcaDeclarationForIndividual;
import com.invest19.demat.persist.pdf.bean.page12.ConsentLetterForAvailingBseStarMfFacility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class LetterForAuthorization {

	private String letterForAuthorizationEmailAddress;
	private String letterForAuthorizationClientsName;
	private Date letterForAuthorizationDate;

	@Embedded
	private SmsAlertFacility smsAlertFacility;

	@Embedded
	private TransactionsUsingSecuredTextingFacility transactionsUsingSecuredTextingFacility;

	@Embedded
	private Easi easi;

	@Embedded
	private OtherDetails otherDetails;

	@Embedded
	private OptionFormForIssueOfDisBooklet optionFormForIssueOfDisBooklet;

	@Embedded
	private FatcaDeclarationForIndividual fatcaDeclarationForIndividual;

	@Embedded
	private ConsentLetterForAvailingBseStarMfFacility consentLetterForAvailingBseStarMfFacility;

}
