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
public class Nominee1 {

	private String nominee1FirstName;
	private String nominee1MiddleName;
	private String nominee1LastName;
	private String nominee1Address;
	private String nominee1City;
	private String nominee1State;
	private String nominee1PinCode;
	private String nominee1Country;
	private String nominee1TelephoneNumber;
	private String nominee1FaxNumber;
	private String nominee1PanNumber;
	private String nominee1Uid;
	private String nominee1EmailId;
	private String nominee1RelationshipWithTheBo;
	private Date nominee1DateOfBirth;
	
	@Embedded
	private Nominee1Guardian nominee1Guardian;
	
	private Double nominee1PercentageOfAllocationOfSecurities;	
	private String nominee1ResidualSecurities;
	
}
