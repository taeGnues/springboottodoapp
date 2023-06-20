package com.springboot.myfirstwebapptodo.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody // 문자열에 맞는 해당 view를 찾지 않고, 문자열 그대로 리턴함
    public String sayHello(){
        return "Hello What are you doing todo";
    }



    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP(){
        return "sayHello";
    } // sayHello 파일에 매핑

}
