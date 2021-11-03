package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Adam", 0001, Year.first);
        Student student2 = new Student("Bob", 0002, Year.first);
        Student student3 = new Student("Cathy", 0003, Year.first);
        Student student4 = new Student("Dan", 0004, Year.second);
        Student student5 = new Student("Ed", 0005, Year.second);
        Student student6 = new Student("Fred", 0006, Year.third);
        Student student7 = new Student("Gold", 0007, Year.fourth);

        List<Student> studentList = List.of(student1,student2, student3, student4, student5, student6, student7);

        Lecturer lecturer = new Lecturer("Edem");

        //Course introToProgramming = new Course(lecturer, studentList, Year.first);
        List<Student> firstYear = studentList.stream().filter(student -> student.getYear() == Year.first).collect(Collectors.toList());
        Course introToProgramming = new Course(lecturer, firstYear, Year.first);





       /* Course advancedGardening = new Course(lecturer,studentList, Year.third || Year.fourth);

        Course physics = new Course(lecturer, studentList, );*/

        System.out.println(introToProgramming);



    }
}
