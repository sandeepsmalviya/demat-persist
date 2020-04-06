package com.invest19.demat.persist.pdf.bean.page07;

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
public class Declaration {
	
	   private String clientName;
       private String declarationPlace;
       private String declarationTradingDate;

}
