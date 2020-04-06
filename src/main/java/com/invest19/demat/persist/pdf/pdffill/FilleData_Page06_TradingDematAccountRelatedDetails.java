package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page6.DealingsThroughOtherMembers;
import com.invest19.demat.persist.pdf.bean.page6.DetailsOfRelatedPerson;
import com.invest19.demat.persist.pdf.bean.page6.DetailsOfRelatedPerson.RpType;
import com.invest19.demat.persist.pdf.bean.page6.PastActions;
import com.invest19.demat.persist.pdf.bean.page6.PrimaryBankingAccount;
import com.invest19.demat.persist.pdf.bean.page6.PrimaryBankingAccount.AccountType;
import com.invest19.demat.persist.pdf.bean.page6.PrimaryDepositoryAccount;
import com.invest19.demat.persist.pdf.bean.page6.PrimaryDepositoryAccount.DpType;
import com.invest19.demat.persist.pdf.bean.page6.TradingDematAccountRelatedDetails;
import com.invest19.demat.persist.pdf.bean.page7.AdditionalDetails;
import com.invest19.demat.persist.pdf.bean.page7.AdditionalDetails.ContactNoteReference;
import com.invest19.demat.persist.pdf.bean.page7.ClientsInterview;
import com.invest19.demat.persist.pdf.bean.page7.ForOfficeUseOnly;
import com.invest19.demat.persist.pdf.bean.page7.InPersonVerification;
import com.invest19.demat.persist.pdf.bean.page7.IntroducerDeatails;
import com.invest19.demat.persist.pdf.bean.page7.IntroducerDeatails.IntroducersStatus;
import com.invest19.demat.persist.pdf.bean.page7.VerificationOfDocuments;
import com.invest19.demat.persist.pdf.bean.page8.PartB;

@RestController
public class FilleData_Page06_TradingDematAccountRelatedDetails {

	@GetMapping("tdard")
	public TradingDematAccountRelatedDetails getTradingDematAccountRelatedDetails() throws ParseException {
		return this.fill();
	}

	public TradingDematAccountRelatedDetails fill() throws ParseException {
		TradingDematAccountRelatedDetails tdard = new TradingDematAccountRelatedDetails();

		
		
		PrimaryBankingAccount primaryBankingAccount = new PrimaryBankingAccount();
		tdard.setPrimaryBankingAccount(primaryBankingAccount);

		primaryBankingAccount.setAccountNumber("051610110000942");
		primaryBankingAccount.setPrimaryBankingAccountType(AccountType.SAVINGS);
		primaryBankingAccount.setPrimaryBankingAccountTypeOthersPleaseSpecify("OTHER_Testing");
		primaryBankingAccount.setBankName("BOI");
		primaryBankingAccount.setBranchAddress("PASHAN ROAD, GANESHKHIND");
		primaryBankingAccount.setBranchName("PASHAN");
		primaryBankingAccount.setPrimaryBankingAccountState("PUNE");
		primaryBankingAccount.setPrimaryBankingAccountCountry("INDIA");
		primaryBankingAccount.setIfscCode("BKID0000516");
		primaryBankingAccount.setMicrNumber("123456789");
		primaryBankingAccount.setPrimaryBankingAccountPincode("411007");
		primaryBankingAccount.setPrimaryBankingAccountState("MAHARASHTRA");

		PrimaryDepositoryAccount primaryDepositoryAccount = new PrimaryDepositoryAccount();
		tdard.setPrimaryDepositoryAccount(primaryDepositoryAccount);

		primaryDepositoryAccount.setBeneficiaryId("123456789");
		primaryDepositoryAccount.setBeneficiaryName("Priyanka Malviya");
		primaryDepositoryAccount.setDepositoryParticipantId("987654321");
		primaryDepositoryAccount.setDepositoryParticipantName("sandeep malviya");
		primaryDepositoryAccount.setDpType(DpType.CDSL);

		PastActions pastActions = new PastActions();
		tdard.setPastActions(pastActions);
		pastActions.setDetails("Past-Actions");

		DealingsThroughOtherMembers dealingsThroughOtherMembers = new DealingsThroughOtherMembers();
		tdard.setDealingsThroughOtherMembers(dealingsThroughOtherMembers);

		dealingsThroughOtherMembers.setAuthorizedPersonName("aarti malviya");
		dealingsThroughOtherMembers.setCity("Mumbai");
		dealingsThroughOtherMembers.setClientCode("1234");
		dealingsThroughOtherMembers.setConcernedMembersNameWithWhomAPIsRegistered("Ramkrishnanna E P");
		dealingsThroughOtherMembers.setDealingsThroughOtherMembersCountry("UK");
		dealingsThroughOtherMembers.setDetailsOfDespute("details of dispute");
		dealingsThroughOtherMembers.setDealingsThroughOtherMembersEmailAddress("piyachouksey@gmail.com");
		dealingsThroughOtherMembers.setExchange("exchange");
		dealingsThroughOtherMembers.setExchangeRegistrationNumber("654321");
		dealingsThroughOtherMembers.setDealingsThroughOtherMembersFax("020 257123");
		dealingsThroughOtherMembers.setRegisteredOfficeAddress("Panchavati CDAC Pune");
		dealingsThroughOtherMembers.setDealingsThroughOtherMembersState("madhya pradesh");
		dealingsThroughOtherMembers.setDealingsThroughOtherMembersTelephone("7028925180");
		dealingsThroughOtherMembers.setWebsite("www.cdac.in");

		DetailsOfRelatedPerson detailsOfRelatedPerson = new DetailsOfRelatedPerson();
		tdard.setDetailsOfRelatedPerson(detailsOfRelatedPerson);

		detailsOfRelatedPerson.setAdditionOfRp(true);
		detailsOfRelatedPerson.setDeletionOfRp(true);
		detailsOfRelatedPerson.setKycNumberOfRp("12345677890123");
		detailsOfRelatedPerson.setNameFirstName("sandeep");
		detailsOfRelatedPerson.setNameLastName("malviya");
		detailsOfRelatedPerson.setNameMiddleName("surendra");
		detailsOfRelatedPerson.setRpType(RpType.GUARDIAN_OF_MINOR);
		detailsOfRelatedPerson.setNamePrefix("Mr");

		AdditionalDetails additionalDetails = new AdditionalDetails();
		tdard.setAdditionalDetails(additionalDetails);

		additionalDetails.setAdditionalDetailsAnyOtherInformation("any other indformation");
		additionalDetails.setContactNoteReference(ContactNoteReference.ELECTRONIC_CONTRACT_NOTE);
		additionalDetails.setAdditionalDetailsEmailAddress("sandeepm@cdac.in");
		additionalDetails.setNumberOfYearsOfInvestment(5);
		additionalDetails.setResidentialAddressToDealInSecurities("B 502 Sai Comforts");

		IntroducerDeatails introducerDeatails = new IntroducerDeatails();
		tdard.setIntroducerDeatails(introducerDeatails);

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date introducerDate = new Date(sdf.parse("26011984").getTime());
		introducerDeatails.setIntroducerDate(introducerDate);

		introducerDeatails.setIntroducersAddress("B 404 sai Comforts");
		introducerDeatails.setIntroducersClientId("12345");
		introducerDeatails.setIntroducersClientName("nitin malviya");
		introducerDeatails.setIntroducersPhoneNumber("9421823987");
		introducerDeatails.setIntroducersStatus(IntroducersStatus.REMISIER);
		introducerDeatails.setNameOfTheIntroducer("bansaramji malviya");
		introducerDeatails.setRelationshipWithTheIntroducer("father");

		ForOfficeUseOnly forOfficeUseOnly = new ForOfficeUseOnly();
		tdard.setForOfficeUseOnly(forOfficeUseOnly);

		forOfficeUseOnly.setClientsUccCode("clientUCCCode");
		forOfficeUseOnly.setForOfficeUseOnlyEmployeeCode("101853");
		forOfficeUseOnly.setForOfficeUseOnlyEmployeeDesignation("JD");
		Date officeuseDate = new Date(sdf.parse("26011984").getTime());
		forOfficeUseOnly.setTradingOfficeuseDate(officeuseDate);


		ClientsInterview clientsInterview = new ClientsInterview();
		forOfficeUseOnly.setClientsInterview(clientsInterview);
		clientsInterview.setClientInterviewedBy("Manish Awasthi");
		clientsInterview.setClientsInterviewEmployeeCode("123456");
		clientsInterview.setClientInterviewEmployeeDesignation("TEAM Leader");
		Date clientsInterviewDate = new Date(sdf.parse("26011984").getTime());
		clientsInterview.setClientInterviewDate(clientsInterviewDate);

		InPersonVerification inPersonVerification = new InPersonVerification();
		forOfficeUseOnly.setInPersonVerification(inPersonVerification);
		inPersonVerification.setInPersonVerificationEmployeeCode("123456");
		inPersonVerification.setInPersonVerificationEmployeeDesignation("TL");
		inPersonVerification.setIpvPerformedBy("IPV");
		Date inPersonVerificationOnDate = new Date(sdf.parse("26011984").getTime());
		inPersonVerification.setInPersonVerificationOnDate(inPersonVerificationOnDate);

		VerificationOfDocuments verificationOfDocuments = new VerificationOfDocuments();
		forOfficeUseOnly.setVerificationOfDocuments(verificationOfDocuments);
		verificationOfDocuments.setDocumentsVerifiedBy("MASTER");
		verificationOfDocuments.setVerificationOfDocumentsEmployeeCode("654321");
		verificationOfDocuments.setVerificationOfDocumentsEmployeeDesignation("Manager");
		Date verificationOfDocumentsOnDate = new Date(sdf.parse("26011984").getTime());
		verificationOfDocuments.setVerificationOfDocumentsOnDate(verificationOfDocumentsOnDate);

		PartB partB = new PartB();
		tdard.setPartB(partB);

		partB.setClientsName("My client");
		Date partBDate = new Date(sdf.parse("26011984").getTime());
		partB.setPartBDate(partBDate);
		
		
		return tdard;
	}

}
