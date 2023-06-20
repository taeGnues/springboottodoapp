package com.springboot.myfirstwebapptodo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    @RequestMapping("login")
    public String gotoLoginPage(){
        return "login";
    } // sayHello 파일에 매핑

}
