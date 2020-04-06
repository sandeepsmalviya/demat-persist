package com.invest19.demat.persist.pdf.bean.page6;

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
public class DetailsOfRelatedPerson {

	private boolean additionOfRp;
	private boolean deletionOfRp;

//	 private String additionOfRp;	 
//     private String deletionOfRp;

	private String kycNumberOfRp;
	
	@Enumerated(EnumType.STRING)
	private RpType rpType;

	public enum RpType {
		GUARDIAN_OF_MINOR, ASSIGNEE, AUTHORIZED_REPRESENTATIVE
	}

	private String namePrefix;
	private String nameFirstName;
	private String nameMiddleName;
	private String nameLastName;

}
