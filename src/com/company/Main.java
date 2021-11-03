package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Adam", 0001, Year.first, List.of(1.0, 2.0, 3.0));
        Student student2 = new Student("Bob", 0002, Year.first, List.of(4.0, 5.0, 6.0));
        Student student3 = new Student("Cathy", 0003, Year.first, List.of(1.0, 2.0, 3.0));
        Student student4 = new Student("Dan", 0004, Year.second, List.of(5.0, 2.0, 3.0));
        Student student5 = new Student("Ed", 0005, Year.second, List.of(1.0, 5.0, 3.0));
        Student student6 = new Student("Fred", 0006, Year.third, List.of(10.0, 10.0, 10.0));
        Student student7 = new Student("Gold", 0007, Year.fourth, List.of(8.0, 2.0, 3.0));
        Student student8 = new Student("Aba",8, Year.fourth, List.of(5.0, 5.0, 5.0));

        List<Student> studentList = List.of(student1,student2, student3, student4, student5, student6, student7, student8);

        Lecturer lecturer = new Lecturer("Edem");

        //Course introToProgramming = new Course(lecturer, studentList, Year.first);
        //first year students
        List<Student> firstYear = studentList.stream().filter(student -> student.getYear() == Year.first).toList();

        //third- and fourth-year students
        List<Student> thirdAndFourthYear = studentList.stream().filter(student -> student.getYear() == Year.third || student.getYear() == Year.fourth).collect(Collectors.toList());

        //Fourth year students whose name starts with vowels
        List <Student> fourthYear = studentList.stream().filter(student -> student.getYear() == Year.fourth &&
                (student.getName().toLowerCase().startsWith("a")||student.getName().toLowerCase().startsWith("e")||student.getName().toLowerCase().startsWith("i")||
                        student.getName().toLowerCase().startsWith("o")||student.getName().toLowerCase().startsWith("u"))).collect(Collectors.toList());


        Course advancedGardeningClass = new Course(lecturer,thirdAndFourthYear, Year.fourth);


        Course introToProgramming = new Course(lecturer, firstYear, Year.first);

        Course physics = new Course(lecturer, fourthYear, Year.fourth);








       /* Course advancedGardening = new Course(lecturer,studentList, Year.third || Year.fourth);

        Course physics = new Course(lecturer, studentList, );*/

        System.out.println(introToProgramming);
        System.out.println(advancedGardeningClass);
        System.out.println(fourthYear);
        System.out.println(physics);



    }
}
