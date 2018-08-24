package com.company.hometask.oop;

import java.util.Scanner;

public class GroupDemo {
    public static void main(String[] args) {
        System.out.println("How many students do you want?");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Group group = new Group(amount);
        int i = 0;
        while (i < amount) {
            System.out.println("Enter 1 if Contract Student, 2 - Student:");
            int type = in.nextInt();
            switch (type) {
                case (1): {
                    String name = in.next();
                    int age = in.nextInt();
                    double price = in.nextDouble();
                    ContractStudent contractStudent = new ContractStudent(age, name, price);
                    group.add(i, contractStudent);
                    i++;
                    break;
                }
                case (2): {
                    String name = in.next();
                    int age = in.nextInt();
                    Student student = new Student(age, name);
                    group.add(i, student);
                    i++;
                    break;
                }
            }

        }
        System.out.println("Group:");
        group.printAll();
        System.out.println("Contracts:");
        group.printOnlyContracts();
    }
}
