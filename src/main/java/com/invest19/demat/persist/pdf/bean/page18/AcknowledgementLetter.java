package com.invest19.demat.persist.pdf.bean.page18;

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
public class AcknowledgementLetter {

	private Date acknowledgementLetterDate;

}
