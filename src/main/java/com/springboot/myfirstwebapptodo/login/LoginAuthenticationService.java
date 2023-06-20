package com.springboot.myfirstwebapptodo.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {
    public boolean authentication(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("taeseung");
        boolean isValidPassword = password.equalsIgnoreCase("1234");

        return isValidUserName && isValidPassword;
    }
}
