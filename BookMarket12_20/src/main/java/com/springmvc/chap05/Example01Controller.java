package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller("chap05")
public class Example01Controller {

    @RequestMapping(value="/exam01", method = RequestMethod.GET)
    public void requestMethod(){
        System.out.println("@Controller exam01 입니다.");
    }


}
