package com.invest19.demat.persist.pdf.bean.page10;

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
public class OptionFormForIssueOfDisBooklet {

	private String optionFormForIssueOfDisBookletBioId;
	private String optionFormForIssueOfDisBookletDpId;
	private Date optionFormForIssueOfDisBookletDate;

	@Enumerated(EnumType.STRING)
	private OptionFormForIssueOfDisBookletSelectOption optionFormForIssueOfDisBookletSelectOption;

	public enum OptionFormForIssueOfDisBookletSelectOption {
		OPTION1, OPTION2
	}
}
