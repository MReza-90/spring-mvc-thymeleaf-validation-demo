package com.code2go.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloUniverseController {

    @GetMapping("/showForm")
    public String showForm(){
        return "initial-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "process-form";
    }

//    @RequestMapping("/processFormV2")
//    public String processFormV2(HttpServletRequest request , Model model){
//
//        String student= request.getParameter("studentName");
//
//        student=student.toUpperCase();
//
//        String result= "Hello "+ student+":))";
//
//        model.addAttribute("message", result);
//
//        return "process-form";
//    }

    @RequestMapping("/processFormV2")
    public String processFormV2(@RequestParam("studentName") String student , Model model){


        student=student.toUpperCase();

        String result= "Hello "+ student+":))";

        model.addAttribute("message", result);

        return "process-form";
    }
}
