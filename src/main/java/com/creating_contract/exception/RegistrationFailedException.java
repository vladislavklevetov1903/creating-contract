package com.creating_contract.exception;

public class RegistrationFailedException extends CodeRuntimeException {
    private static ErrorCode errorCode = ErrorCode.REGISTRATION_FAILED;

    public RegistrationFailedException() {
        super(errorCode);
    }

    public RegistrationFailedException(String message) {
        super(errorCode, message);
    }
}
