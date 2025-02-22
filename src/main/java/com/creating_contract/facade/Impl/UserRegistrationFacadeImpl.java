package com.creating_contract.facade.Impl;

import com.creating_contract.facade.UserRegistrationFacade;
import com.creating_contract.model.UserRegistrationRequestModel;
import com.creating_contract.model.UserRegistrationResponseModel;
import com.creating_contract.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRegistrationFacadeImpl implements UserRegistrationFacade {

    private final UserService userService;

    public UserRegistrationResponseModel registerUser(UserRegistrationRequestModel model){
        userService.registration(model);
        return new UserRegistrationResponseModel(
                model.getFirstName(),
                model.getLastName(),
                model.getEmail()

        );
    }

    public String deleteById(Long id) {
        userService.deleteById(id);
        return "User " + id + " удален";
    }
}
