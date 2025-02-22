package com.creating_contract.service.Impl;

import com.creating_contract.entity.UserEntity;
import com.creating_contract.exception.UserNotFoundException;
import com.creating_contract.model.UserRegistrationRequestModel;
import com.creating_contract.repository.UserRepository;
import com.creating_contract.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public void registration(UserRegistrationRequestModel model) {

        try {
            UserEntity user = new UserEntity();
            user.setFirstName(model.getFirstName());
            user.setLastName(model.getLastName());
            user.setEmail(model.getEmail());
            user.setPassword(passwordEncoder.encode(model.getPassword()));
            userRepository.save(user);
        } catch (Exception e) {
            throw new UserNotFoundException();
        }
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
