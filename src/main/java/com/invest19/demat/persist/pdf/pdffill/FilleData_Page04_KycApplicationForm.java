package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page04.AddressDetails;
import com.invest19.demat.persist.pdf.bean.page04.AddressDetails.AddressType;
import com.invest19.demat.persist.pdf.bean.page04.AddressDetails.ProofOfAddress;
import com.invest19.demat.persist.pdf.bean.page04.Declaration;
import com.invest19.demat.persist.pdf.bean.page04.Declaration.AccountType;
import com.invest19.demat.persist.pdf.bean.page04.Declaration.ApplicationType;
import com.invest19.demat.persist.pdf.bean.page04.IdentityDetails;
import com.invest19.demat.persist.pdf.bean.page04.IdentityDetails.Gender;
import com.invest19.demat.persist.pdf.bean.page04.IdentityDetails.MaritalStatus;
import com.invest19.demat.persist.pdf.bean.page04.IdentityDetails.ResidentialStatus;
import com.invest19.demat.persist.pdf.bean.page04.KycApplicationForm;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
@Slf4j
public class FilleData_Page04_KycApplicationForm {



	@GetMapping("kyc")
	public KycApplicationForm getKycApplicationForm() throws ParseException {
		return this.fill();
	}

	public KycApplicationForm fill() throws ParseException {

		KycApplicationForm kycApplicationForm = new KycApplicationForm();

		IdentityDetails identityDetails = new IdentityDetails();
		AddressDetails addressDetails = new AddressDetails();
		Declaration declaration = new Declaration();

		identityDetails.setAadharNumber("123412341234");
		identityDetails.setCitizenship(IdentityDetails.Citizenship.IN_INDIAN);
		identityDetails.setCountryCode("91");

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date dt = new Date(sdf.parse("26011984").getTime());
		identityDetails.setDateOfBirth(dt);

		identityDetails.setFatherSpouseName("Suendra");
		identityDetails.setFullName("Sandeep Surendra Malviya");
		identityDetails.setGender(Gender.MALE);
		identityDetails.setMaidenName("Surendra");
		identityDetails.setMaritalStatus(MaritalStatus.MARRIED);
		identityDetails.setMotherName("Santoshi");
		identityDetails.setNregaJob("yet_to_be_tested");
		identityDetails.setPanNumber("ARHPM8174D");
		identityDetails.setProofOfIdentitySubmittedForPANExemptDrivingLicence(true);
		identityDetails.setProofOfIdentitySubmittedForPANExemptUid(true);
		identityDetails.setProofOfIdentitySubmittedForPANExemptOthers("others_data");
		identityDetails.setResidentialStatus(ResidentialStatus.RESIDENT_INDIVIDUAL);

		addressDetails.setAddressForResidenceCorrespondence("B 502 Sai Comforts Pimprigaon Pune");
		addressDetails.setAddressType(AddressType.RESIDENTIAL_BUSINESS);
		addressDetails.setCityTownVillage("PUNE");
		addressDetails.setCountry("INDIA");

		Date dt3 = new Date(sdf.parse("26011984").getTime());
		addressDetails.setAddressDate(dt3);

		addressDetails.setEmailAddress("sandeepmalviya@gmail.com");
		addressDetails.setFax("1234567890");
		addressDetails.setMobile("9890586180");
		addressDetails.setPermanantAdrressIfDifferent("AT POST KUSUMKOT BK TAH DHARNI DIST AMRAVATI");
		addressDetails.setPinCode("411017");
		addressDetails.setPinCode2("444702");
		

		addressDetails.setCountry2("USA");
		addressDetails.setCityTownVillage2("AMRAVATI");
		addressDetails.setProofOfAddress(ProofOfAddress.PASSPORT);
		addressDetails.setProofOfAddressOthers("other_proof");
		addressDetails.setState("Maharashtra");
		addressDetails.setState2("MaharashtraMP");
		addressDetails.setTelephoneOffice("07226224212");
		addressDetails.setTelephoneResidential("020224212");
		addressDetails.setAnyOtherInformation("anyOtherInformation");

		declaration.setAccountType(AccountType.SIMPLIFIED);
		declaration.setApplicationType(ApplicationType.UPDATE);
		declaration.setAttestedTrueCopies(true);
		declaration.setOriginalsVerifiedTrueCopies(true);
		

		Date dt1 = new Date(sdf.parse("26011984").getTime());
		declaration.setDeclarationDate(dt1);

		declaration.setIpvDone(true);

		Date dt2 = new Date(sdf.parse("26011984").getTime());
		declaration.setIpvDoneOnDate(dt2);

		declaration.setKycNumber("12345678");
		declaration.setOriginalsVerifiedTrueCopies(false);
		declaration.setPlace("PUNE");

		kycApplicationForm.setIdentityDetails(identityDetails);
		kycApplicationForm.setAddressDetails(addressDetails);
		kycApplicationForm.setDeclaration(declaration);

		return kycApplicationForm;

	}

}
