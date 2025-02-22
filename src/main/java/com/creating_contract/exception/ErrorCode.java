package com.creating_contract.exception;

public enum ErrorCode {

    USER_NOT_FOUND("USER_NOT_FOUND", "User not found"),
    REGISTRATION_FAILED("REGISTRATION_FAILED", "Registration failed"),
    LOGIN_FAILED("LOGIN_FAILED", "Login failed"),
    ;


    private final String code;
    private final String message;


    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
