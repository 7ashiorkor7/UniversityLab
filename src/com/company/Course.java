package com.company;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> studentList;
    private Year year;

    public Course(Lecturer lecturer, List<Student> studentList, Year year) {
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.year = year;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", studentList=" + studentList +
                ", year=" + year +
                '}';
    }
}
