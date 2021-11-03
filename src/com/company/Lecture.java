package com.company;

import java.util.List;

public class Lecture {
    List<Student> studentList;

    public Lecture(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void Enter(Student student){

    }

    public Double getHighestAverageGrade(){
        return studentList.stream().mapToDouble(student -> student.getAverageGrade()).max().getAsDouble();
    }
}
