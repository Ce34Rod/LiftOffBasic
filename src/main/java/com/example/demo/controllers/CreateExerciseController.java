package com.example.demo.controllers;

import com.example.demo.models.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.demo.models.Exercise.exercises;

@Controller
@RequestMapping("create")
public class CreateExerciseController {




    @GetMapping ("exercise")
    public String ViewCreateAnExercise() {
        return "create/exercise";
    }


    @PostMapping("submit")
    public String submitForm(
            @RequestParam String exerciseName,
            @RequestParam String exerciseType,
            @RequestParam String targetMuscles,
            @RequestParam String exerciseNotes,
            Model model) {

        exercises.add(new Exercise(exerciseName, exerciseType, targetMuscles, exerciseNotes));
        return "/userExercises";
    }


}
