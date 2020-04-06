package com.invest19.demat.persist.pdf.bean.page10;

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
public class Easi {

	@Enumerated(EnumType.STRING)
	private EasiAvailBasicServicesDematFacility easiAvailBasicServicesDematFacility;

	public enum EasiAvailBasicServicesDematFacility {
		YES, NO
	};

}
