package com.invest19.demat.persist.pdf.bean.page10;

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
public class SmsAlertFacility {

	private String smsAlertFacilityMobile;

}
