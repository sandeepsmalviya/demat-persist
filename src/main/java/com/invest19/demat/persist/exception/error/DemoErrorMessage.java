package com.invest19.demat.persist.exception.error;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoErrorMessage {

	private String message;
	private Date errorDate;

}
