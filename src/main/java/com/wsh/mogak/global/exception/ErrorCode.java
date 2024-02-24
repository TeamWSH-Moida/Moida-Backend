package com.wsh.mogak.global.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "Expired Token"),
    INVALID_TOKEN_TYPE(HttpStatus.UNAUTHORIZED, "Invalid Token Type");

    private final HttpStatus status;
    private final String message;
}