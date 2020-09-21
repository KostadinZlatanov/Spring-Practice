package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage(){
        System.out.println("Im in!"); //This is invoked
        return "main-menu"; //This does not resolve to .jsp
    }
}
