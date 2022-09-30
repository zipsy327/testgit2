package com.example.boottest2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String home(){
        System.out.println("home");
        return "board/hello";
    }
}
