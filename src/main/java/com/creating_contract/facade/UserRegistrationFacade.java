package com.creating_contract.facade;

import com.creating_contract.model.UserRegistrationRequestModel;
import com.creating_contract.model.UserRegistrationResponseModel;

public interface UserRegistrationFacade {

    UserRegistrationResponseModel registerUser(UserRegistrationRequestModel model);
    String deleteById(Long id);
}
