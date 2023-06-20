package com.springboot.myfirstwebapptodo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginAuthenticationService authenticationService;
    // GET을 이 메소드에서 처리하고 있음!

    public LoginController(LoginAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    } // sayHello 파일에 매핑


    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){

        // Authentication 로직
        // name : taeseung
        // password : 1234

        if (authenticationService.authentication(name, password)){
            model.put("name", name);


            return "welcome";
        }



        model.put("errorMessage", "Invalid Credentials! Please try again!");
        return "login";
    } // sayHello 파일에 매핑
}
