package com.invest19.demat.persist.pdf.bean.page05;

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
public class HolderDetails {

	private String firstHoldersName;
	private String firstPanNumber;
	private String firstUidNumber;

	private String secondHoldersName;
	private String secondPanNumber;
	private String secondUidNumber;

	private String thirdHoldersName;
	private String thirdPanNumber;
	private String thirdUidNumber;

	private String name;

}
