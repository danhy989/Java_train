package com.danhy989.SpringSecurity.service;

import com.danhy989.SpringSecurity.model.JwtRequest;

public interface JwtAuthenticationService {
    String createAuthenticationToken(JwtRequest authenticationRequest) throws Exception;
}
