package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page18.AcknowledgementLetter;

@RestController
public class FilleData_Page18_AcknowledgementLetter {

	@GetMapping("al")
	public AcknowledgementLetter getAcknowledgementLetter() throws ParseException {
		return this.fill();
	}

	public AcknowledgementLetter fill() throws ParseException {

		AcknowledgementLetter acknowledgementLetter = new AcknowledgementLetter();

		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date acknowledgementLetter_date = new Date(sdf.parse("26011984").getTime());
		acknowledgementLetter.setAcknowledgementLetterDate(acknowledgementLetter_date);

		return acknowledgementLetter;
	}

}
