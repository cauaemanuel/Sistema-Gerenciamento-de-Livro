package com.deloite.exception;

import org.springframework.http.HttpStatus;

public record ResponseError(HttpStatus httpStatus, String argumentosInvalidos) {
}
