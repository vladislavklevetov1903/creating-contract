package com.creating_contract.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegistrationResponseModel {
    private String firstName;
    private String lastName;
    private String email;
}
