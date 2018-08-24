package com.company.module.oop2;

import java.util.ArrayList;

public class Student {
    private String fio;
    private ArrayList<Integer> achievements;
    public static final int MAXIMUM = 5;
    public static final int MINIMUM = 3;
    private double scholarship;

    public Student(String fio) {
        this.fio = fio;
        this.achievements = new ArrayList<Integer>();
    }

    public Student(String fio, ArrayList<Integer> achievements) {
        this.fio = fio;
        this.achievements = achievements;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public ArrayList<Integer> getAchievements() {
        return achievements;
    }

    public void setAchievements(ArrayList<Integer> achievements) {
        this.achievements = achievements;
    }


    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NAME : " + getFio().toUpperCase() + "\n");
        builder.append("ACHIVEMENT: ");
        for (Integer e : achievements) {
            builder.append(e + " ");
        }
        builder.append("\nSCHOLARSHIP " + this.scholarship + "\n");
        return builder.toString();
    }
}
