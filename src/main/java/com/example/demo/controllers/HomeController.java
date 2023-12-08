package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import static com.example.demo.models.Exercise.exercises;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("userExercises")
    public String viewAllExercises(Model model){
        model.addAttribute("exercises", exercises);
        return "userExercises";
    }
}
