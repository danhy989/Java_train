package com.danhy989.SpringSecurity.service.impl;

import com.danhy989.SpringSecurity.dto.UserDTO;
import com.danhy989.SpringSecurity.model.DAOUser;
import com.danhy989.SpringSecurity.repository.UserRepository;
import com.danhy989.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public DAOUser saveUser(UserDTO userDTO) {
        DAOUser newUser = new DAOUser();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(newUser);
        return newUser;
    }
}
