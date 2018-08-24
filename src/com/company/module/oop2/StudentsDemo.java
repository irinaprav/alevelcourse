package com.company.module.oop2;

public class StudentsDemo {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList();
        studentsList.addStudent("aaaaaaa", 5, 5, 4, 4);
        studentsList.addStudent("sssssss", 3, 2, 4);
        studentsList.addStudent("lllllll", 5, 5, 4, 4, 2);
        studentsList.addStudent("ooooo", 4, 4, 4, 4);
        studentsList.addStudent("los", 5, 5, 5);
        studentsList.addStudent("lo1s", 5, 5, 5, 1);
        studentsList.countScholarship();
        System.out.println(studentsList.toString());
    }
}
