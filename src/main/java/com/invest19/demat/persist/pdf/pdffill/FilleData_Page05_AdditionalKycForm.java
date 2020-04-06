package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page5.AdditionalKycForm;
import com.invest19.demat.persist.pdf.bean.page5.DepositoryParticipant;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.AccountStatementRequired;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.InstructDpToAcceptAllPledgeInstructions;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.InstructDpToReceiveEachAndEveryCredit;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.ReceiveAnnualReport;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.ReceiveDividentInterestDirectlyInBankAccount;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.SendElectronicTransactioCumHolding;
import com.invest19.demat.persist.pdf.bean.page5.DetailsOfGuardian.ShareEmailIdWithTheRta;
import com.invest19.demat.persist.pdf.bean.page5.HolderDetails;
import com.invest19.demat.persist.pdf.bean.page5.TypeOfAccount;
import com.invest19.demat.persist.pdf.bean.page5.TypeOfAccount.ForeignNational;
import com.invest19.demat.persist.pdf.bean.page5.TypeOfAccount.Individual;
import com.invest19.demat.persist.pdf.bean.page5.TypeOfAccount.Nri;
import com.invest19.demat.persist.pdf.bean.page5.TypeOfAccount.Type;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FilleData_Page05_AdditionalKycForm {

	@GetMapping("ad-kyc")
	public AdditionalKycForm getKycApplicationForm() throws ParseException {
		return this.fill();
	}

	public AdditionalKycForm fill() throws ParseException {

		AdditionalKycForm additionalKycForm = new AdditionalKycForm();

		DepositoryParticipant depositoryParticipant = new DepositoryParticipant();
		DetailsOfGuardian detailsOfGuardian = new DetailsOfGuardian();
		HolderDetails holderDetails = new HolderDetails();
		TypeOfAccount typeOfAccount = new TypeOfAccount();

		depositoryParticipant.setApplicationNumber("123456");
		depositoryParticipant.setBioId("12345");

		SimpleDateFormat sdf1 = new SimpleDateFormat("ddMMyyyy");
		Date depositoryParticipantDate = new Date(sdf1.parse("26011984").getTime());
		depositoryParticipant.setDepositoryParticipantDate(depositoryParticipantDate);

		depositoryParticipant.setDpId("12345678");
		depositoryParticipant.setDpInternalReferenceNumber("12345");

		detailsOfGuardian.setAccountStatementRequired(AccountStatementRequired.AS_PER_SEBI_REGUATION);
		detailsOfGuardian.setGuardiansName("Surendra T Malviya");
		detailsOfGuardian.setInstructDpToReceiveEachAndEveryCredit(InstructDpToReceiveEachAndEveryCredit.NO);
		detailsOfGuardian.setInstructDpToAcceptAllPledgeInstructions(InstructDpToAcceptAllPledgeInstructions.YES);
		detailsOfGuardian.setGuardianPanNumber("ARHPM8174D");
		detailsOfGuardian.setReceiveAnnualReport(ReceiveAnnualReport.BOTH_PHYSICAL_AND_ELECTRONIC);
		detailsOfGuardian
				.setReceiveDividentInterestDirectlyInBankAccount(ReceiveDividentInterestDirectlyInBankAccount.YES);
		detailsOfGuardian.setRelationshipWithTheApplicant("SON");
		detailsOfGuardian.setSendElectronicTransactioCumHolding(SendElectronicTransactioCumHolding.YES);
		detailsOfGuardian.setShareEmailIdWithTheRta(ShareEmailIdWithTheRta.YES);

		holderDetails.setFirstHoldersName("Sandeep");
		holderDetails.setFirstPanNumber("ARHPM8174D");
		holderDetails.setFirstUidNumber("222233334444");
		holderDetails.setSecondHoldersName("Priyanka");
		holderDetails.setSecondPanNumber("BCDEFGHIJK");
		holderDetails.setSecondUidNumber("282828282828");
		holderDetails.setThirdHoldersName("Piya");
		holderDetails.setThirdPanNumber("PIYA100516");
		holderDetails.setThirdUidNumber("101010101010");

		holderDetails.setName("C-DAC");

		typeOfAccount.setType(Type.FORIGN_NATIONAL);
		typeOfAccount.setForeignNational(ForeignNational.OTHERS);
		typeOfAccount.setForeignNationalOthers("USA");
		typeOfAccount.setIndividual(Individual.INDIVIDUAL_DIRECTOR);
		typeOfAccount.setIndividualOthers("OTHER_INDIVIDUAL");
		typeOfAccount.setNri(Nri.NRI_DEPOSITORY_RECEIPTS);
		typeOfAccount.setNriOthers("NRI_OTHERS");

		additionalKycForm.setDepositoryParticipant(depositoryParticipant);
		additionalKycForm.setDetailsOfGuardian(detailsOfGuardian);
		additionalKycForm.setHolderDetails(holderDetails);
		additionalKycForm.setTypeOfAccount(typeOfAccount);

		return additionalKycForm;
	}

}
