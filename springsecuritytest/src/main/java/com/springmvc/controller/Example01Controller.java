package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example01Controller {


  @GetMapping("/exam01")
  public String requestMethod(Model model){
    return "webpage08_01"; // 타입이 void일때는 리턴과 겟매핑이 같아야함
  }

  @GetMapping("admin/main")
  public String requestMethod2(Model model){
    model.addAttribute("data","/webpage01/adminPage.jsp");
    return "webpage01/adminPage";
  }
  @GetMapping("employee/main")
  public String requestMethod3(Model model){
    model.addAttribute("data","/webpage01/employeePage.jsp");
    return "webpage01/employeePage";
  }
  @GetMapping("member/main")
  public String requestMethod4(Model model){
    model.addAttribute("data","/webpage01/memberPage.jsp");
    return "webpage01/memberPage";
  }
  @GetMapping("home/main")
  public String requestMethod5(Model model){
    model.addAttribute("data","/webpage01/homePage.jsp");
    return "webpage01/homePage";
  }
}
