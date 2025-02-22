package com.creating_contract.service;

import com.creating_contract.model.UserRegistrationRequestModel;

public interface UserService {

    void registration(UserRegistrationRequestModel model);
    void deleteById(Long id);
}

