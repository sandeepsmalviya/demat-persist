package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page13.NominationDetails;
import com.invest19.demat.persist.pdf.bean.page13.NominationDetails.NominationDetailsHereByDeclare;
import com.invest19.demat.persist.pdf.bean.page13.Nominee1;
import com.invest19.demat.persist.pdf.bean.page13.Nominee1Guardian;
import com.invest19.demat.persist.pdf.bean.page13.Nominee2;
import com.invest19.demat.persist.pdf.bean.page13.Nominee2Guardian;
import com.invest19.demat.persist.pdf.bean.page13.Nominee3;
import com.invest19.demat.persist.pdf.bean.page13.Nominee3Guardian;
import com.invest19.demat.persist.pdf.bean.page14.NominationDetailsDeclaration;
import com.invest19.demat.persist.pdf.bean.page14.NominationDetailsDeclaration.NominationDetailsHereByDeclareDeclaration;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@RestController
public class FilleData_Page13_NominationDetails {

	@GetMapping("nd")
	public NominationDetails getNominationDetails() throws ParseException {
		return this.fill();
	}

	public NominationDetails fill() throws ParseException {

		NominationDetails nominationDetails = new NominationDetails();

		
		nominationDetails.setNominationDetailsDpId("DPID12345");
		  nominationDetails.setNominationDetailsBioId("123456789");
		  nominationDetails.setNominationDetailsFirstHolderName("sandeep");
		  nominationDetails.setNominationDetailsHereByDeclare(NominationDetailsHereByDeclare.OPTION_FIRST);
		  
		  SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy"); Date
		  nominationDetailsDate = new Date(sdf.parse("26011984").getTime());
		  nominationDetails.setNominationDetailsDate(nominationDetailsDate);
		  
		  
		  Nominee1 nominationDetailsNominee1 = new Nominee1();
		  nominationDetailsNominee1.setNominee1Address("nominee1Address");
		  nominationDetailsNominee1.setNominee1City("nominee1City");
		  nominationDetailsNominee1.setNominee1Country("nominee1Country");
		  
		  SimpleDateFormat sdf1 = new SimpleDateFormat("ddMMyyyy"); Date
		  nominee1DateOfBirth = new Date(sdf1.parse("26011984").getTime());
		  
		  nominationDetailsNominee1.setNominee1DateOfBirth(nominee1DateOfBirth);
		  nominationDetailsNominee1.setNominee1EmailId("nominee1EmailId");
		  nominationDetailsNominee1.setNominee1FaxNumber("nominee1FaxNumber");
		  nominationDetailsNominee1.setNominee1FirstName("nominee1FirstName");
		  
		  Nominee1Guardian nominee1Guardian1 = new Nominee1Guardian();
		  nominationDetailsNominee1.setNominee1Guardian(nominee1Guardian1);
		  
		  nominee1Guardian1.setNominee1GuardianFirstName("nominee1GuardianFirstName");
		  nominee1Guardian1.setNominee1GuardianMiddleName("nominee1GuardianMiddleName");
		  nominee1Guardian1.setNominee1GuradianAddress("nominee1GuradianAddress");
		  nominee1Guardian1.setNominee1GuradianAge(30);
		  nominee1Guardian1.setNominee1GuradianCity("nominee1GuradianCity");
		  nominee1Guardian1.setNominee1GuradianCountry("nominee1GuradianCountry");
		  nominee1Guardian1.setNominee1GuradianEmailId("nominee1GuradianEmailId");
		  nominee1Guardian1.setNominee1GuradianFaxNumber("nominee1GuradianFaxNumber");
		  nominee1Guardian1.setNominee1GuradianLastName("nominee1GuradianLastName");
		  nominee1Guardian1.setNominee1GuradianPinCode("444702");
		  nominee1Guardian1.setNominee1GuradianRelationshipWithNominee("nominee1GuradianRelationshipWithNominee");
		  nominee1Guardian1.setNominee1GuradianState("nominee1GuradianState");
		  nominee1Guardian1.setNominee1GuradianTelephoneNumber("07226224214");
		  
		  nominationDetailsNominee1.setNominee1LastName("nominee1LastName");
		  nominationDetailsNominee1.setNominee1MiddleName("nominee1MiddleName");
		  nominationDetailsNominee1.setNominee1PanNumber("nominee1PanNumber");
		  nominationDetailsNominee1.setNominee1PercentageOfAllocationOfSecurities(70.5);
		  nominationDetailsNominee1.setNominee1PinCode("411017");
		  nominationDetailsNominee1.setNominee1RelationshipWithTheBo("nominee1RelationshipWithTheBo");
		  nominationDetailsNominee1.setNominee1ResidualSecurities("nominee1ResidualSecurities");
		  nominationDetailsNominee1.setNominee1State("nominee1State");
		  nominationDetailsNominee1.setNominee1TelephoneNumber("7028925180");
		  nominationDetailsNominee1.setNominee1Uid("UID_001");
		  
		  Nominee2 nominationDetailsNominee2 = new Nominee2();
		  nominationDetailsNominee2.setNominee2Address("Nominee2Address");
		  nominationDetailsNominee2.setNominee2City("Nominee2City");
		  nominationDetailsNominee2.setNominee2Country("Nominee2Country");
		  
		  SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy"); Date
		  nominee2DateOfBirth = new Date(sdf2.parse("26011984").getTime());
		  
		  nominationDetailsNominee2.setNominee2DateOfBirth(nominee2DateOfBirth);
		  nominationDetailsNominee2.setNominee2EmailId("Nominee2EmailId");
		  nominationDetailsNominee2.setNominee2FaxNumber("Nominee2FaxNumber");
		  nominationDetailsNominee2.setNominee2FirstName("Nominee2FirstName");
		  
		  Nominee2Guardian nominee2Guardian = new Nominee2Guardian();
		  nominationDetailsNominee2.setNominee2Guardian(nominee2Guardian);
		  
		  nominee2Guardian.setNominee2GuardianFirstName("Nominee2GuardianFirstName");
		  nominee2Guardian.setNominee2GuardianMiddleName("Nominee2GuardianMiddleName");
		  nominee2Guardian.setNominee2GuradianAddress("Nominee2GuradianAddress");
		  nominee2Guardian.setNominee2GuradianAge(30);
		  nominee2Guardian.setNominee2GuradianCity("Nominee2GuradianCity");
		  nominee2Guardian.setNominee2GuradianCountry("Nominee2GuradianCountry");
		  nominee2Guardian.setNominee2GuradianEmailId("Nominee2GuradianEmailId");
		  nominee2Guardian.setNominee2GuradianFaxNumber("Nominee2GuradianFaxNumber");
		  nominee2Guardian.setNominee2GuradianLastName("Nominee2GuradianLastName");
		  nominee2Guardian.setNominee2GuradianPinCode("444702");
		  nominee2Guardian.setNominee2GuradianRelationshipWithNominee("Nominee2GuradianRelationshipWithNominee");
		  nominee2Guardian.setNominee2GuradianState("Nominee2GuradianState");
		  nominee2Guardian.setNominee2GuradianTelephoneNumber("07226224214");
		  
		  nominationDetailsNominee2.setNominee2LastName("Nominee2LastName");
		  nominationDetailsNominee2.setNominee2MiddleName("Nominee2MiddleName");
		  nominationDetailsNominee2.setNominee2PanNumber("Nominee2PanNumber");
		  nominationDetailsNominee2.setNominee2PercentageOfAllocationOfSecurities(70.5);
		  nominationDetailsNominee2.setNominee2PinCode("411017");
		  nominationDetailsNominee2.setNominee2RelationshipWithTheBo("Nominee2RelationshipWithTheBo");
		  nominationDetailsNominee2.setNominee2ResidualSecurities("Nominee2ResidualSecurities");
		  nominationDetailsNominee2.setNominee2State("Nominee2State");
		  nominationDetailsNominee2.setNominee2TelephoneNumber("7028925180");
		  nominationDetailsNominee2.setNominee2Uid("UID_001");
		  
		  Nominee3 nominationDetailsNominee3 = new Nominee3();
		  nominationDetailsNominee3.setNominee3Address("Nominee3Address");
		  nominationDetailsNominee3.setNominee3City("Nominee3City");
		  nominationDetailsNominee3.setNominee3Country("Nominee3Country");
		  
		  SimpleDateFormat sdf3 = new SimpleDateFormat("ddMMyyyy"); Date
		  nominee3DateOfBirth = new Date(sdf3.parse("26011984").getTime());
		  
		  nominationDetailsNominee3.setNominee3DateOfBirth(nominee3DateOfBirth);
		  nominationDetailsNominee3.setNominee3EmailId("Nominee3EmailId");
		  nominationDetailsNominee3.setNominee3FaxNumber("Nominee3FaxNumber");
		  nominationDetailsNominee3.setNominee3FirstName("Nominee3FirstName");
		  
		  Nominee3Guardian nominee3Guardian = new Nominee3Guardian();
		  nominationDetailsNominee3.setNominee3Guardian(nominee3Guardian);
		  
		  nominee3Guardian.setNominee3GuardianFirstName("Nominee3GuardianFirstName");
		  nominee3Guardian.setNominee3GuardianMiddleName("Nominee3GuardianMiddleName");
		  nominee3Guardian.setNominee3GuradianAddress("Nominee3GuradianAddress");
		  nominee3Guardian.setNominee3GuradianAge(30);
		  nominee3Guardian.setNominee3GuradianCity("Nominee3GuradianCity");
		  nominee3Guardian.setNominee3GuradianCountry("Nominee3GuradianCountry");
		  nominee3Guardian.setNominee3GuradianEmailId("Nominee3GuradianEmailId");
		  nominee3Guardian.setNominee3GuradianFaxNumber("Nominee3GuradianFaxNumber");
		  nominee3Guardian.setNominee3GuradianLastName("Nominee3GuradianLastName");
		  nominee3Guardian.setNominee3GuradianPinCode("444702");
		  nominee3Guardian.setNominee3GuradianRelationshipWithNominee("Nominee3GuradianRelationshipWithNominee");
		  nominee3Guardian.setNominee3GuradianState("Nominee3GuradianState");
		  nominee3Guardian.setNominee3GuradianTelephoneNumber("07226224214");
		  
		  nominationDetailsNominee3.setNominee3LastName("Nominee3LastName");
		  nominationDetailsNominee3.setNominee3MiddleName("Nominee3MiddleName");
		  nominationDetailsNominee3.setNominee3PanNumber("Nominee3PanNumber");
		  nominationDetailsNominee3.setNominee3PercentageOfAllocationOfSecurities(70.5);
		  nominationDetailsNominee3.setNominee3PinCode("411017");
		  nominationDetailsNominee3.setNominee3RelationshipWithTheBo("Nominee3RelationshipWithTheBo");
		  nominationDetailsNominee3.setNominee3ResidualSecurities("Nominee3ResidualSecurities");
		  nominationDetailsNominee3.setNominee3State("Nominee3State");
		  nominationDetailsNominee3.setNominee3TelephoneNumber("7028925180");
		  nominationDetailsNominee3.setNominee3Uid("UID_001");
		  
		  nominationDetails.setNominationDetailsNominee1(nominationDetailsNominee1);
		  nominationDetails.setNominationDetailsNominee2(nominationDetailsNominee2);
		  nominationDetails.setNominationDetailsNominee3(nominationDetailsNominee3);
		  
		  nominationDetails.setNominationDetailsPlace("PUNE");
		  nominationDetails.setNominationDetailsRegistrationNumber("001234");
		  nominationDetails.setNominationDetailsSecondHolderName("surendra");
		  nominationDetails.setNominationDetailsThirdHolderName("malviya");
		  nominationDetails.setNominationDetailsWitnessAddress("witnessadrress");
		  nominationDetails.setNominationDetailsWitnessName("witnessname");
		  
		  NominationDetailsDeclaration nominationDetailsDeclaration = new NominationDetailsDeclaration();
		  nominationDetails.setNominationDetailsDeclaration(nominationDetailsDeclaration);
		  
		  nominationDetailsDeclaration.setNominationDetailsDeclarationEmailBelongsTo("nominationDetailsDeclarationEmailBelongsTo");
		  nominationDetailsDeclaration.setNominationDetailsDeclarationRelationShipWithClient(
		  "nominationDetailsDeclarationRelationShipWithClient");
		  nominationDetailsDeclaration
		  .setNominationDetailsHereByDeclareDeclaration(NominationDetailsHereByDeclareDeclaration.YES);
		  
		  
		 

		return nominationDetails;
	}

}
