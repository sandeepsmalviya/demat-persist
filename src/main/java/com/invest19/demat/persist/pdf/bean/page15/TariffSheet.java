package com.invest19.demat.persist.pdf.bean.page15;

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
public class TariffSheet {

	private String tariffSheetBioId;
	private Date tariffSheetDate;
//	private boolean tariffSheetBrokerage;
//	private boolean tariffSheetPriorityPack;

	@Enumerated(EnumType.STRING)
	private ChargeStructureEnum chargeStructure;

	public enum ChargeStructureEnum {
		BORKERAGE, PRORITY_PACK
	}

}
