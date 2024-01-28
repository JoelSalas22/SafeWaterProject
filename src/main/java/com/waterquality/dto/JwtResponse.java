package com.waterquality.dto;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;

    private String username;
    private List<String> roles;


}
