package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
@RequestMapping("/home")
public class Example04Controller {

    @GetMapping("/exam04")
    public void requestMethod(){
        System.out.println("@Controller exam04 입니다.");
    }


}
