package com.company;

import java.util.Random;

public class Teacher extends Person {
    private Random random = new Random();
    private Exam exam;
    public Teacher(String name, Exam exam) {
        super(name);
        this.exam = exam;
    }

    public Exam getExam(){
        return exam;
    }
    public int grade(Entrant entrant){
        return  random.nextInt(11);
    }
}
