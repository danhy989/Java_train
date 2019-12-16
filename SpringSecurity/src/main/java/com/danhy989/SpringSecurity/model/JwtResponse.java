package com.danhy989.SpringSecurity.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -9122695069705598617L;

    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }
    public String getToken() {
        return this.jwttoken;
    }
}
