package com.danhy989.SpringSecurity.controller;

import com.danhy989.SpringSecurity.dto.UserDTO;
import com.danhy989.SpringSecurity.model.JwtRequest;
import com.danhy989.SpringSecurity.model.JwtResponse;
import com.danhy989.SpringSecurity.service.JwtAuthenticationService;
import com.danhy989.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
public class JwtAuthenticationController {

    private JwtAuthenticationService jwtAuthenticationService;
    private UserService userService;

    @Autowired
    public void setJwtAuthenticationService(JwtAuthenticationService jwtAuthenticationService,UserService userService) {
        this.jwtAuthenticationService = jwtAuthenticationService;
        this.userService = userService;
    }

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {
        return ResponseEntity.ok(new JwtResponse(jwtAuthenticationService.createAuthenticationToken(authenticationRequest)));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> saveUser(@RequestBody UserDTO user) throws Exception {
        return ResponseEntity.ok(userService.saveUser(user));
    }


}

