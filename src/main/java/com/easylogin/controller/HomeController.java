package com.easylogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Home(){
        return "Hello!";
    }

    @GetMapping("/secure")
    public String Secure(){
        return "Secured Page";
    }
}
