package com.invest19.demat.persist.pdf.bean.page7;

import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class IntroducerDeatails {

	private String nameOfTheIntroducer;
	private String relationshipWithTheIntroducer;
	
	@Enumerated(EnumType.STRING)
	private IntroducersStatus introducersStatus;

	public enum IntroducersStatus {
		EXISTING_CLIENT, AUTHORIZED_PERSON, SUB_BROKER, REMISIER
	}

	private String introducersAddress;
	private String introducersPhoneNumber;
	private String introducersClientId;
	private String introducersClientName;
	private Date introducerDate;

}
