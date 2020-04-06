package com.invest19.demat.persist.pdf.pdffill;

import java.text.ParseException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorney;
import com.invest19.demat.persist.pdf.bean.page16.PowerOfAttorneyAnnexureB;

@RestController
public class FilleData_Page16_PowerOfAttorney {

	@GetMapping("poa")
	public PowerOfAttorney getPowerOfAttorney() throws ParseException {
		return this.fill();
	}

	public PowerOfAttorney fill() throws ParseException {

		PowerOfAttorney powerOfAttorney = new PowerOfAttorney();
		powerOfAttorney.setPowerOfAttorneyFirstHolderName("PowerOfAttorney_firstHolderName");
		powerOfAttorney.setPowerOfAttorneyDpId("1234");
		powerOfAttorney.setPowerOfAttorneySecondHolderName("powerOfAttorney_secondHolderName");
		powerOfAttorney.setPowerOfAttorneyThirdHolderName("powerOfAttorney_thirdHolderName");
		powerOfAttorney.setPowerOfAttorneyClientId("987654321");

		PowerOfAttorneyAnnexureB powerOfAttorneyAnnexureB = new PowerOfAttorneyAnnexureB();
		powerOfAttorney.setPowerOfAttorneyAnnexureB(powerOfAttorneyAnnexureB);

		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBDayOf("dayOf");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBOnThis("onThis");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness1Address("address1");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness1Name("name1");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness1Signature("signature1");

		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness2Address("address2");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness2Name("name2");
		powerOfAttorneyAnnexureB.setPowerOfAttorneyAnnexureBWitness2Signature("signature2");

		return powerOfAttorney;
	}

}
