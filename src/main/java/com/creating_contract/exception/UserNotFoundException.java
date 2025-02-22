package com.creating_contract.exception;

public class UserNotFoundException extends CodeRuntimeException {

    private static ErrorCode errorCode = ErrorCode.USER_NOT_FOUND;

    public UserNotFoundException() {
        super(errorCode);
    }

    public UserNotFoundException(String message) {
        super(errorCode, message);
    }
}
