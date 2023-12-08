package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

public static List<Exercise> exercises = new ArrayList<>();

    private String exerciseName;
    private String exerciseType;
    private String targetMuscles;
    private String exerciseNotes;

    public Exercise(String exerciseName, String exerciseType, String targetMuscles, String exerciseNotes) {
        this.exerciseName = exerciseName;
        this.exerciseType = exerciseType;
        this.targetMuscles = targetMuscles;
        this.exerciseNotes = exerciseNotes;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public String getTargetMuscles() {
        return targetMuscles;
    }

    public void setTargetMuscles(String targetMuscles) {
        this.targetMuscles = targetMuscles;
    }

    public String getExerciseNotes() {
        return exerciseNotes;
    }

    public void setExerciseNotes(String exerciseNotes) {
        this.exerciseNotes = exerciseNotes;
    }

}
