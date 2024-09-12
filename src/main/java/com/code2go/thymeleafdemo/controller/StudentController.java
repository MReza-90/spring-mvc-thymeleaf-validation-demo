package com.code2go.thymeleafdemo.controller;

import com.code2go.thymeleafdemo.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${latestDegree}")
    private List<String> degrees;

    @Value("${subjects}")
    private List<String> subjects;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showStudentForm")
    public String showForm(@Valid Model model){

        Student student = new Student();
        model.addAttribute("student",student);
        model.addAttribute("countries",countries);
        model.addAttribute("degrees",degrees);
        model.addAttribute("subjects",subjects);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model){

        if(bindingResult.hasErrors()){
            // Reload the model attributes in case of validation errors
            model.addAttribute("countries", countries);
            model.addAttribute("degrees", degrees);
            model.addAttribute("subjects", subjects);
            return "student-form";
        }else {
            return "process-form";
        }
    }
}
