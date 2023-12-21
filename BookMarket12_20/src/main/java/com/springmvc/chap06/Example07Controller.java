package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class Example07Controller {

    @GetMapping("/exam07")
    public String requestMethod(@RequestParam String id, Model model){

        System.out.println("도서 ID : " + id);
        model.addAttribute("data", "도서 ID : " + id);
        return "webpage06";
    }
}
