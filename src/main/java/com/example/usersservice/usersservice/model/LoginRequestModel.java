package com.example.usersservice.usersservice.model;

import lombok.Data;

@Data
public class LoginRequestModel {
    private String email;
    private String password;
}
