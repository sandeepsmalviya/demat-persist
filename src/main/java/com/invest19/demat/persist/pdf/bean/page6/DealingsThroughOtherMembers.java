package com.invest19.demat.persist.pdf.bean.page6;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Embeddable
public class DealingsThroughOtherMembers {
	
	
	   private String authorizedPersonName;
       private String exchange;
       private String exchangeRegistrationNumber;
       private String concernedMembersNameWithWhomAPIsRegistered;
       private String clientCode;
       private String registeredOfficeAddress;
       private String city;
       private String dealingsThroughOtherMembersState;
       private String dealingsThroughOtherMembersCountry;
       private String dealingsThroughOtherMembersTelephone;
       private String dealingsThroughOtherMembersFax;
       private String dealingsThroughOtherMembersEmailAddress;
       private String website;
       private String detailsOfDespute;
       

}
