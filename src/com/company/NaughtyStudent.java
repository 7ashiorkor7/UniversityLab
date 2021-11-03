package com.company;

import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(String name, int studentID, Year year, List<Double> grades) {
        super(name, studentID, year, grades);
    }

    @Override
    public Double getAverageGrade(){
        //return grades.stream().mapToDouble(grade -> grade).average().getAsDouble();
        return super.getAverageGrade() * 1.1;

    }
}
