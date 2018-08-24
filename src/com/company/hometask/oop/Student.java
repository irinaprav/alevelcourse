package com.company.hometask.oop;

public class Student {
    private int age;
    private String name;

    Student() {
        this(17, "Default Name");
    }

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print("Name:   " + name + "\nAge:    " + age);
    }
}
