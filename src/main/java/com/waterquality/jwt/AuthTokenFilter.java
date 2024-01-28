package com.waterquality.jwt;

public class AuthTokenFilter {
    private final JwtUtils jwtUtils;

    public AuthTokenFilter(JwtUtils jwtUtils) {
        this.jwtUtils = jwtUtils;
    }
}
