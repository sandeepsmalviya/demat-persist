package com.invest19.demat.persist.pdf.bean.page06;

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
public class PrimaryDepositoryAccount {

	private String depositoryParticipantName;
	
	@Enumerated(EnumType.STRING)
	private DpType dpType;
	
	public enum DpType {
		NSDL, CDSL
	}
	private String depositoryParticipantId;
	private String beneficiaryName;
	private String beneficiaryId;

}
