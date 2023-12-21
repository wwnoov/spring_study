package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
@RequestMapping("/spring")
public class Example02Controller {

    @RequestMapping(value="/exam02", method = RequestMethod.GET)
    public void requestMethod(){
        System.out.println("@Controller exam02 입니다.");
    }


}
