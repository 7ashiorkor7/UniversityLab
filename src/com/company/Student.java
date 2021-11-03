package com.company;


import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int studentID;
    private Year year;
    private List<Double> grades;


    public Student(String name, int studentID, Year year, List<Double> grades ) {
        this.name = name;
        this.studentID = studentID;
        this.year = year;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", year=" + year +
                '}';
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Double getAverageGrade(){
        return grades.stream().mapToDouble(grade -> grade).average().getAsDouble();

    }
}
