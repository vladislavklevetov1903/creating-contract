package com.creating_contract.controller;

import com.creating_contract.facade.UserRegistrationFacade;
import com.creating_contract.model.UserRegistrationRequestModel;
import com.creating_contract.model.UserRegistrationResponseModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private final UserRegistrationFacade userRegistrationFacade;


    @PostMapping("/register")
    public UserRegistrationResponseModel registerUser(@RequestBody UserRegistrationRequestModel model) {
       return userRegistrationFacade.registerUser(model);
    }

    @PostMapping("/delete")
    public String delete(
            @RequestParam Long id
    ){
        return userRegistrationFacade.deleteById(id);
    }
}
