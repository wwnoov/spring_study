package com.springmvc.controller;

import com.springmvc.domain.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test1")
    public String test1(DataBean bean, Model model) {

        String [] data_list1 = {"data1","data2","data3", "data4", "data5", "data6","data7"};
        model.addAttribute("data_list1",data_list1);
        bean.setA1("data2");
        return "test1";
    }
}