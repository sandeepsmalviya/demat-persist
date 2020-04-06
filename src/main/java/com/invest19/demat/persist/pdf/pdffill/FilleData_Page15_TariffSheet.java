package com.invest19.demat.persist.pdf.pdffill;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invest19.demat.persist.pdf.bean.page15.TariffSheet;
import com.invest19.demat.persist.pdf.bean.page15.TariffSheet.ChargeStructureEnum;

@RestController
public class FilleData_Page15_TariffSheet {

	@GetMapping("ts")
	public TariffSheet getTariffSheet() throws ParseException {
		return this.fill();
	}

	public TariffSheet fill() throws ParseException {

		TariffSheet tariffSheet = new TariffSheet();
		tariffSheet.setTariffSheetBioId("123456789");
		tariffSheet.setChargeStructure(ChargeStructureEnum.BORKERAGE);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		Date tariffSheetDate = new Date(sdf.parse("26011984").getTime());
		tariffSheet.setTariffSheetDate(tariffSheetDate);

		return tariffSheet;
	}

}
