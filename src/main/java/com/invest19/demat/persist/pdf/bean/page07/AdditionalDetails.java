package com.invest19.demat.persist.pdf.bean.page07;

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
public class AdditionalDetails {

	@Enumerated(EnumType.STRING)
	  private ContactNotePreference contactNotePreference;
	  
	  public enum ContactNotePreference {
		  
		  ELECTRONIC_CONTRACT_NOTE,
		  PHYSICAL_CONTRACT_NOTE,
	  }
	  
	  private boolean iWishToAvailIntenetTrading;
      private Integer numberOfYearsOfInvestment;
      private String additionalDetailsAnyOtherInformation;

      private String additionalDetailsEmailAddress;
      private String residentialAddressToDealInSecurities;
      
      

}
