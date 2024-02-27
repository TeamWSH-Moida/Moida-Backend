package com.wsh.mogak.global.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ErrorCode {

    /* Token */
    EXPIRED_TOKEN(HttpStatus.UNAUTHORIZED, "Expired Token"),
    INVALID_TOKEN_TYPE(HttpStatus.UNAUTHORIZED, "Invalid Token Type"),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED, "Invalid Token"),

    /* Member */
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "Member Not Found");

    private final HttpStatus status;
    private final String message;
}