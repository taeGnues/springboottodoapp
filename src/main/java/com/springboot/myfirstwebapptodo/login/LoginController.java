package com.springboot.myfirstwebapptodo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model){
        model.put("name", name); // view에 인수를 넘기고 싶을 때는 modelmap 객체를 사용함
        logger.debug("param is {}", name);
        return "login";
    } // sayHello 파일에 매핑

}
