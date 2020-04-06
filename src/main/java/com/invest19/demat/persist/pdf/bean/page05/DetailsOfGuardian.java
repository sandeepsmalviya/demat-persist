package com.invest19.demat.persist.pdf.bean.page05;

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
public class DetailsOfGuardian {

	private String guardiansName;
	private String relationshipWithTheApplicant;
	private String guardianPanNumber;

	@Enumerated(EnumType.STRING)
	private InstructDpToReceiveEachAndEveryCredit instructDpToReceiveEachAndEveryCredit;

	@Enumerated(EnumType.STRING)
	private InstructDpToAcceptAllPledgeInstructions instructDpToAcceptAllPledgeInstructions;

	@Enumerated(EnumType.STRING)
	private AccountStatementRequired accountStatementRequired;

	@Enumerated(EnumType.STRING)
	private SendElectronicTransactioCumHolding sendElectronicTransactioCumHolding;

	@Enumerated(EnumType.STRING)
	private ShareEmailIdWithTheRta shareEmailIdWithTheRta;

	@Enumerated(EnumType.STRING)
	private ReceiveAnnualReport receiveAnnualReport;

	@Enumerated(EnumType.STRING)
	private ReceiveDividentInterestDirectlyInBankAccount receiveDividentInterestDirectlyInBankAccount; // Yes/No

	public enum InstructDpToReceiveEachAndEveryCredit {
		YES, NO
	}

	public enum InstructDpToAcceptAllPledgeInstructions {
		YES, NO
	}

	public enum AccountStatementRequired {
		AS_PER_SEBI_REGUATION, DAILY, WEEKLY, FORTNIGHTLY, MONTHLY
	}

	public enum SendElectronicTransactioCumHolding {
		YES, NO
	}

	public enum ShareEmailIdWithTheRta {
		YES, NO
	}

	public enum ReceiveAnnualReport {
		PHYSICAL, EECTRONIC, BOTH_PHYSICAL_AND_ELECTRONIC
	}

	public enum ReceiveDividentInterestDirectlyInBankAccount {
		YES, NO
	}

}
