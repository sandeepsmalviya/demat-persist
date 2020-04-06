package com.invest19.demat.persist.pdf.bean.page05;

import java.sql.Date;

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
public class DepositoryParticipant {

	
	private String applicationNumber;
	private Date depositoryParticipantDate;
	private String dpInternalReferenceNumber;
	private String dpId;
	private String bioId;
	
	
}
