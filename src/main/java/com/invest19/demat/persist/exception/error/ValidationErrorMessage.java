package com.invest19.demat.persist.exception.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ValidationErrorMessage extends SubErrorMessage {
    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    ValidationErrorMessage(String object, String message) {
        this.object = object;
        this.message = message;
    }
}
