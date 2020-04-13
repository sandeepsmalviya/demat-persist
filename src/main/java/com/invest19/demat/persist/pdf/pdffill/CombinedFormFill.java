package com.invest19.demat.persist.pdf.pdffill;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.invest19.demat.persist.pdf.bean.PdfApplicationForm;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Component
public class CombinedFormFill {

	@Autowired
	private FilleData_Page04_KycApplicationForm page4;

	@Autowired
	private FilleData_Page05_AdditionalKycForm page5;

	@Autowired
	private FilleData_Page06_TradingDematAccountRelatedDetails page6;

	public PdfApplicationForm fill() throws ParseException {

		PdfApplicationForm pdfApplicationForm = new PdfApplicationForm();

		pdfApplicationForm.setUserId("ARHPM8174D");
		pdfApplicationForm.setAcknowledgementLetter(new FilleData_Page18_AcknowledgementLetter().fill());
		pdfApplicationForm.setKycApplicationForm(page4.fill());
		pdfApplicationForm.setAdditionalKycForm(page5.fill());
		pdfApplicationForm.setTradingDematAccountRelatedDetails(page6.fill());

		pdfApplicationForm.setLetterForAuthorization(new FilleData_Page09_LetterForAuthorization().fill());

		pdfApplicationForm.setNominationDetails(new FilleData_Page13_NominationDetails().fill());
		pdfApplicationForm.setPowerOfAttorney(new FilleData_Page16_PowerOfAttorney().fill());
		pdfApplicationForm.setTariffSheet(new FilleData_Page15_TariffSheet().fill());

//		pdfApplicationForm.setNominationDetails(new FilleData_Page13_NominationDetails().fill());
//		pdfApplicationForm.setPowerOfAttorney(new FilleData_Page16_PowerOfAttorney().fill());
//		pdfApplicationForm.setTariffSheet(new FilleData_Page15_TariffSheet().fill());

		return pdfApplicationForm;
	}
}
