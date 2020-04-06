package com.invest19.demat.persist.pdf.bean.page13;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class Nominee2 {

	private String nominee2FirstName;
	private String nominee2MiddleName;
	private String nominee2LastName;
	private String nominee2Address;
	private String nominee2City;
	private String nominee2State;
	private String nominee2PinCode;
	private String nominee2Country;
	private String nominee2TelephoneNumber;
	private String nominee2FaxNumber;
	private String nominee2PanNumber;
	private String nominee2Uid;
	private String nominee2EmailId;
	private String nominee2RelationshipWithTheBo;
	private Date nominee2DateOfBirth;

	@Embedded
	private Nominee2Guardian nominee2Guardian;
	private Double nominee2PercentageOfAllocationOfSecurities;

	private String nominee2ResidualSecurities;
}
