package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page09.LetterForAuthorization;
import com.invest19.demat.persist.pdf.bean.page10.Easi;
import com.invest19.demat.persist.pdf.bean.page10.Easi.EasiAvailBasicServicesDematFacility;
import com.invest19.demat.persist.pdf.bean.page10.OptionFormForIssueOfDisBooklet;
import com.invest19.demat.persist.pdf.bean.page10.OptionFormForIssueOfDisBooklet.OptionFormForIssueOfDisBookletSelectOption;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsAffiliations;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsBusiness;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsForNonIndividuals;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsGrossAnnulaIncomeDetails;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsOccupationType;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsOthers;
import com.invest19.demat.persist.pdf.bean.page10.OtherDetails.OtherDetailsService;
import com.invest19.demat.persist.pdf.bean.page10.SmsAlertFacility;
import com.invest19.demat.persist.pdf.bean.page10.TransactionsUsingSecuredTextingFacility;
import com.invest19.demat.persist.pdf.bean.page10.TransactionsUsingSecuredTextingFacility.TustfReadTermsAndConditions;
import com.invest19.demat.persist.pdf.bean.page11.FatcaDeclarationForIndividual;
import com.invest19.demat.persist.pdf.bean.page11.FatcaDeclarationForIndividual.FdfiCitizenship;
import com.invest19.demat.persist.pdf.bean.page11.FatcaDeclarationForIndividual.FdfiSourceOfWealth;
import com.invest19.demat.persist.pdf.bean.page12.ConsentLetterForAvailingBseStarMfFacility;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class FilleData_Page09_LetterForAuthorization {

	@GetMapping("loa")
	public LetterForAuthorization getLetterForAuthorization() throws ParseException {
		return this.fill();
	}

	public LetterForAuthorization fill() throws ParseException {

		LetterForAuthorization letterForAuthorization = new LetterForAuthorization();
		letterForAuthorization.setLetterForAuthorizationEmailAddress("letterForAuthorizationEmailAddress");
		letterForAuthorization.setLetterForAuthorizationClientsName("letterForAuthorizationClientsName");

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date letterForAuthorizationDate = new Date(sdf.parse("26011984").getTime());
		letterForAuthorization.setLetterForAuthorizationDate(letterForAuthorizationDate);

		SmsAlertFacility smsAlertFacility = new SmsAlertFacility();
		letterForAuthorization.setSmsAlertFacility(smsAlertFacility);
		smsAlertFacility.setSmsAlertFacilityMobile("9890586180");

		TransactionsUsingSecuredTextingFacility transactionsUsingSecuredTextingFacility = new TransactionsUsingSecuredTextingFacility();
		letterForAuthorization.setTransactionsUsingSecuredTextingFacility(transactionsUsingSecuredTextingFacility);

		transactionsUsingSecuredTextingFacility.setTustfReadTermsAndConditions(TustfReadTermsAndConditions.YES);

		transactionsUsingSecuredTextingFacility.setTustfClearingMemberId1("clearingMemberId1");
		transactionsUsingSecuredTextingFacility.setTustfClearingMemberId2("clearingMemberId2");
		transactionsUsingSecuredTextingFacility.setTustfClearingMemberName1("clearingMemberName1");
		transactionsUsingSecuredTextingFacility.setTustfClearingMemberName2("clearingMemberName2");
		transactionsUsingSecuredTextingFacility.setTustfStockExchangeNameId1("stockEchangeNameId1");
		transactionsUsingSecuredTextingFacility.setTustfStockExchangeNameId2("stockEchangeNameId1");

		Easi easi = new Easi();
		letterForAuthorization.setEasi(easi);
		easi.setEasiAvailBasicServicesDematFacility(EasiAvailBasicServicesDematFacility.YES);

		OtherDetails otherDetails = new OtherDetails();
		letterForAuthorization.setOtherDetails(otherDetails);

		otherDetails.setOtherDetailsAffiliations(OtherDetailsAffiliations.POLITICALLY_EXPOSED_PERSON);
		otherDetails.setOtherDetailsAnyOtherInformation("OtherDetailsAnyOtherInformation");
		
//		otherDetails.setOtherDetailsBBusiness(true);
//		otherDetails.setOtherDetailsOOthers(true);
//		otherDetails.setOtherDetailsSService(true);
		
		otherDetails.setOtherDetailsOccupationType(OtherDetailsOccupationType.B_BUSINESS);
		
		
		
		otherDetails.setOtherDetailsBusiness(OtherDetailsBusiness.AGRICULTURIST);
		
		Date otherDetailsDate = new Date(sdf.parse("26011984").getTime());
		otherDetails.setOtherDetailsDate(otherDetailsDate);
		otherDetails.setOtherDetailsForNonIndividuals(OtherDetailsForNonIndividuals.OVER_1_CRORE);
		otherDetails.setOtherDetailsGrossAnnulaIncomeDetails(OtherDetailsGrossAnnulaIncomeDetails.MORE_THAN_25_LAC);
		otherDetails.setOtherDetailsNetWorthValue("1 CRORE");
		
		otherDetails.setOtherDetailsService(OtherDetailsService.GOVERNMENT_SECTOR);
		
		otherDetails.setOthersDetailsOthers(OtherDetailsOthers.PROFESSIONAL);

		OptionFormForIssueOfDisBooklet optionFormForIssueOfDisBooklet = new OptionFormForIssueOfDisBooklet();
		letterForAuthorization.setOptionFormForIssueOfDisBooklet(optionFormForIssueOfDisBooklet);

		optionFormForIssueOfDisBooklet.setOptionFormForIssueOfDisBookletBioId("123456789");
		Date optionFormForIssueOfDisBookletDate = new Date(sdf.parse("26011984").getTime());
		optionFormForIssueOfDisBooklet.setOptionFormForIssueOfDisBookletDate(optionFormForIssueOfDisBookletDate);
		optionFormForIssueOfDisBooklet
				.setOptionFormForIssueOfDisBookletSelectOption(OptionFormForIssueOfDisBookletSelectOption.OPTION1);

		FatcaDeclarationForIndividual fatcaDeclarationForIndividual = new FatcaDeclarationForIndividual();
		letterForAuthorization.setFatcaDeclarationForIndividual(fatcaDeclarationForIndividual);

		fatcaDeclarationForIndividual.setFdfiCitizenship1(FdfiCitizenship.INDIA);
		fatcaDeclarationForIndividual.setFdfiCityOfBirthCountryOfBirth1("cityOfBirthCountryOfBirth1");
		fatcaDeclarationForIndividual.setFdfiCountriesOtherThanIndia1("countriesOtherThanIndia1");
		fatcaDeclarationForIndividual.setFdfiNameOfAccountHolder1("fdfiNnameOfAccountHolder1");
		fatcaDeclarationForIndividual.setFdfiSourceOfWealth1(FdfiSourceOfWealth.BUSINESS);
		fatcaDeclarationForIndividual
				.setFdfiTaxIdentificationNumberOrEquivalent1("taxIdentificationNumberOrEquivalent1");
		
		
		fatcaDeclarationForIndividual.setFdfiCitizenship2(FdfiCitizenship.USA);
		fatcaDeclarationForIndividual.setFdfiCityOfBirthCountryOfBirth2("cityOfBirthCountryOfBirth2");
		fatcaDeclarationForIndividual.setFdfiCountriesOtherThanIndia2("countriesOtherThanIndia2");
		fatcaDeclarationForIndividual.setFdfiNameOfAccountHolder2("fdfiNnameOfAccountHolder2");
		fatcaDeclarationForIndividual.setFdfiSourceOfWealth2(FdfiSourceOfWealth.GITFT);
		fatcaDeclarationForIndividual
				.setFdfiTaxIdentificationNumberOrEquivalent2("taxIdentificationNumberOrEquivalent2");
		
		
		
		fatcaDeclarationForIndividual.setFdfiCitizenship3(FdfiCitizenship.OTHERS);
		fatcaDeclarationForIndividual.setFdfiCityOfBirthCountryOfBirth3("cityOfBirthCountryOfBirth3");
		fatcaDeclarationForIndividual.setFdfiCountriesOtherThanIndia3("countriesOtherThanIndia3");
		fatcaDeclarationForIndividual.setFdfiNameOfAccountHolder3("fdfiNnameOfAccountHolder3");
		fatcaDeclarationForIndividual.setFdfiSourceOfWealth3(FdfiSourceOfWealth.PRIZE_MONEY);
		fatcaDeclarationForIndividual
				.setFdfiTaxIdentificationNumberOrEquivalent3("taxIdentificationNumberOrEquivalent3");
		
		
		
		
		

		ConsentLetterForAvailingBseStarMfFacility consentLetterForAvailingBseStarMfFacility = new ConsentLetterForAvailingBseStarMfFacility();
		letterForAuthorization.setConsentLetterForAvailingBseStarMfFacility(consentLetterForAvailingBseStarMfFacility);
		consentLetterForAvailingBseStarMfFacility.setConsentLetterName("sandeep malviya");
		consentLetterForAvailingBseStarMfFacility
				.setConsentLetterNameClientCodeNumber("consentLetterNameClientCodeNumber");

		return letterForAuthorization;
	}

}
