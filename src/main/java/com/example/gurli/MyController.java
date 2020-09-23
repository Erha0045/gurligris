package com.example.gurli;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/website")
    public String test(){
        return "website";
    }
}
