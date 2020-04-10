package com.invest19.demat.persist.pdf.bean.page07;

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
public class TradingDeclaration {
	
	   private String clientName;
       private String declarationPlace;
       private Date declarationTradingDate;

}
