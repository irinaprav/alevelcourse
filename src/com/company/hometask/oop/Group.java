package com.company.hometask.oop;

public class Group {
    private Student[] students;
    private int amountofstudents;

    Group() {
        this(5);
    }

    Group(int amountofstudents) {
        this.amountofstudents = amountofstudents;
        this.students = new Student[amountofstudents];
    }

    public void add(int i, Student student) {
        students[i] = student;
    }

    public int getAmountofstudents() {
        return students.length;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void printAll() {
        for (int i = 0; i < students.length; i++) {
            students[i].print();
            System.out.println("\n");
        }
    }

    public void printOnlyContracts() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof ContractStudent) {
                students[i].print();
                System.out.println("\n");
            }
        }
    }

}





