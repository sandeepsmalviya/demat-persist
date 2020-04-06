
package com.invest19.demat.persist.pdf.bean.page14;

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
public class NominationDetailsDeclaration {

	@Enumerated(EnumType.STRING)
	private NominationDetailsHereByDeclareDeclaration nominationDetailsHereByDeclareDeclaration;

	public enum NominationDetailsHereByDeclareDeclaration {
		YES, NO
	}

	private String nominationDetailsDeclarationEmailBelongsTo;
	private String nominationDetailsDeclarationRelationShipWithClient;

}
