package com.creating_contract.model;

import lombok.Data;

@Data
public class UserRegistrationRequestModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
