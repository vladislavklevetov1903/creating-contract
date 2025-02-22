package com.creating_contract.exception;

public class LoginException extends CodeRuntimeException {

    private static ErrorCode errorCode = ErrorCode.LOGIN_FAILED;

    public LoginException() {
        super(errorCode);
    }

    public LoginException(String message) {
        super(errorCode, message);
    }
}
