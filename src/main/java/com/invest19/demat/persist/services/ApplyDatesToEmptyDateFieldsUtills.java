package com.invest19.demat.persist.services;

import java.sql.Date;

import org.springframework.stereotype.Service;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;
import com.invest19.demat.persist.pdf.bean.page04.KycApplicationForm;
import com.invest19.demat.persist.pdf.bean.page05.AdditionalKycForm;
import com.invest19.demat.persist.pdf.bean.page06.TradingDematAccountRelatedDetails;
import com.invest19.demat.persist.pdf.bean.page07.ForOfficeUseOnly;
import com.invest19.demat.persist.pdf.bean.page09.LetterForAuthorization;
import com.invest19.demat.persist.pdf.bean.page13.NominationDetails;
import com.invest19.demat.persist.pdf.bean.page15.TariffSheet;
import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorney;
import com.invest19.demat.persist.pdf.bean.page18.AcknowledgementLetter;

@Service
public class ApplyDatesToEmptyDateFieldsUtills {

	public void applyDates(PdfApplicationForm pdfApplicationFrom) {

		this.applyDatesToKycApplicationForm(pdfApplicationFrom.getKycApplicationForm());
		this.applyDatesToAdditionalKycForm(pdfApplicationFrom.getAdditionalKycForm());
		this.applyDateToTradingDematAccountRelatedDetails(pdfApplicationFrom.getTradingDematAccountRelatedDetails());
		this.applyDateToForOfficeUseOnly(
				pdfApplicationFrom.getTradingDematAccountRelatedDetails().getForOfficeUseOnly());
		this.applyDateToLetterForAuthorization(pdfApplicationFrom.getLetterForAuthorization());
		this.applyDateToNominationDetails(pdfApplicationFrom.getNominationDetails());
		this.applyDateToTariffSheet(pdfApplicationFrom.getTariffSheet());
		this.applyDateToPowerOfAttorney(pdfApplicationFrom.getPowerOfAttorney());
		this.applyDateToAcknowledgementLetter(pdfApplicationFrom.getAcknowledgementLetter());
	}

	public void applyDatesToKycApplicationForm(KycApplicationForm kycApplicationForm) {

		if (kycApplicationForm.getAddressDetails().getAddressDate() == null) {
			Date addressDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			kycApplicationForm.getAddressDetails().setAddressDate(addressDate);
		}

		if (kycApplicationForm.getDeclaration().getDeclarationDate() == null) {
			Date declarationDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			kycApplicationForm.getDeclaration().setDeclarationDate(declarationDate);
		}

		if (kycApplicationForm.getDeclaration().getIpvDoneOnDate() == null) {
			Date ipvDoneOnDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			kycApplicationForm.getDeclaration().setIpvDoneOnDate(ipvDoneOnDate);
		}

	}

	public void applyDatesToAdditionalKycForm(AdditionalKycForm additionalKycForm) {

		if (additionalKycForm.getDepositoryParticipant().getDepositoryParticipantDate() == null) {
			Date depositoryParticipantDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			additionalKycForm.getDepositoryParticipant().setDepositoryParticipantDate(depositoryParticipantDate);
		}

	}

	public void applyDateToTradingDematAccountRelatedDetails(
			TradingDematAccountRelatedDetails tradingDematAccountRelatedDetails) {

		if (tradingDematAccountRelatedDetails.getTradingPreferences().getTradingPreferencesDate() == null) {
			Date tradingPreferencesDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			tradingDematAccountRelatedDetails.getTradingPreferences().setTradingPreferencesDate(tradingPreferencesDate);
		}

		if (tradingDematAccountRelatedDetails.getIntroducerDeatails().getIntroducerDate() == null) {
			Date introducerDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			tradingDematAccountRelatedDetails.getIntroducerDeatails().setIntroducerDate(introducerDate);
		}

		if (tradingDematAccountRelatedDetails.getTradingDeclaration().getDeclarationTradingDate() == null) {
			Date declarationTradingDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			tradingDematAccountRelatedDetails.getTradingDeclaration().setDeclarationTradingDate(declarationTradingDate);
		}

		this.applyDateToForOfficeUseOnly(tradingDematAccountRelatedDetails.getForOfficeUseOnly());

		if (tradingDematAccountRelatedDetails.getPartB().getPartBDate() == null) {
			Date partBDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			tradingDematAccountRelatedDetails.getPartB().setPartBDate(partBDate);

		}

	}

	public void applyDateToForOfficeUseOnly(ForOfficeUseOnly forOfficeUseOnly) {
		if (forOfficeUseOnly.getTradingOfficeuseDate() == null) {
			Date tradingOfficeuseDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			forOfficeUseOnly.setTradingOfficeuseDate(tradingOfficeuseDate);
		}

		if (forOfficeUseOnly.getClientsInterview().getClientInterviewDate() == null) {
			Date clientsInterviewDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			forOfficeUseOnly.getClientsInterview().setClientInterviewDate(clientsInterviewDate);
		}

		if (forOfficeUseOnly.getInPersonVerification().getInPersonVerificationOnDate() == null) {
			Date inPersonVerificationOnDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			forOfficeUseOnly.getInPersonVerification().setInPersonVerificationOnDate(inPersonVerificationOnDate);
		}

		if (forOfficeUseOnly.getVerificationOfDocuments().getVerificationOfDocumentsOnDate() == null) {
			Date verificationOfDocumentsOnDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			forOfficeUseOnly.getVerificationOfDocuments()
					.setVerificationOfDocumentsOnDate(verificationOfDocumentsOnDate);
		}

	}

	public void applyDateToLetterForAuthorization(LetterForAuthorization letterForAuthorization) {

		if (letterForAuthorization.getLetterForAuthorizationDate() == null) {
			Date letterForAuthorizationDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			letterForAuthorization.setLetterForAuthorizationDate(letterForAuthorizationDate);

		}

		if (letterForAuthorization.getOtherDetails().getOtherDetailsDate() == null) {
			Date otherDetailsDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			letterForAuthorization.getOtherDetails().setOtherDetailsDate(otherDetailsDate);

		}

		if (letterForAuthorization.getOptionFormForIssueOfDisBooklet()
				.getOptionFormForIssueOfDisBookletDate() == null) {
			Date optionFormForIssueOfDisBookletDate = new Date(
					new java.util.Date(System.currentTimeMillis()).getTime());
			letterForAuthorization.getOptionFormForIssueOfDisBooklet()
					.setOptionFormForIssueOfDisBookletDate(optionFormForIssueOfDisBookletDate);

		}

	}

	public void applyDateToNominationDetails(NominationDetails nominationDetails) {

	}

	public void applyDateToTariffSheet(TariffSheet tariffSheet) {

		if (tariffSheet.getTariffSheetDate() == null) {
			Date tariffSheetDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			tariffSheet.setTariffSheetDate(tariffSheetDate);
		}
	}

	public void applyDateToPowerOfAttorney(PowerOfAttorney powerOfAttorney) {

	}

	public void applyDateToAcknowledgementLetter(AcknowledgementLetter acknowledgementLetter) {

		if (acknowledgementLetter.getAcknowledgementLetterDate() == null) {
			Date acknowledgementLetterDate = new Date(new java.util.Date(System.currentTimeMillis()).getTime());
			acknowledgementLetter.setAcknowledgementLetterDate(acknowledgementLetterDate);
		}
	}

}
