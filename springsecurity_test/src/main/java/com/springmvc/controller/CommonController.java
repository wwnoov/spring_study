package com.springmvc.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class CommonController {

  @GetMapping("/accessError")
  public void accessDenied(Authentication auth, Model model){
    //void는 겟 매핑이름으로 jsp 를 만들어라 String은 retrun 뒤에로 jsp를 만들어라

    log.info("access Denied : "+ auth);
    model.addAttribute("msg","Access Denied");

  }

  @GetMapping("/customLogin")
  public void loginInput(String error, String logout , Model model){
    log.info("error : "+ error);
    log.info("logout : " + logout);

    if (error != null){
      model.addAttribute("error","login Error check your Account");
    }

    if (logout != null){
      model.addAttribute("logout","logout !!");
    }
  }

  @GetMapping("/customLogout")
  public void logoutGet(){
    log.info("custom logout");
  }

}
