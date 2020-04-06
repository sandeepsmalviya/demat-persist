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
public class Nominee3 {

	private String nominee3FirstName;
	private String nominee3MiddleName;
	private String nominee3LastName;
	private String nominee3Address;
	private String nominee3City;
	private String nominee3State;
	private String nominee3PinCode;
	private String nominee3Country;
	private String nominee3TelephoneNumber;
	private String nominee3FaxNumber;
	private String nominee3PanNumber;
	private String nominee3Uid;
	private String nominee3EmailId;
	private String nominee3RelationshipWithTheBo;
	private Date nominee3DateOfBirth;

	@Embedded
	private Nominee3Guardian nominee3Guardian;
	private Double nominee3PercentageOfAllocationOfSecurities;

	private String nominee3ResidualSecurities;
}
