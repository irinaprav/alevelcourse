package com.company.practice.delivery;

import java.util.Scanner;

public class DeliverPackageDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        City city[] = City.values();
        for (City s : city) {
            System.out.println(s.name());
        }
        System.out.println("Enter city from : ");
        City cityFrom = City.valueOf(in.next().trim().toUpperCase());
        System.out.println("Enter city to : ");
        City cityTo = City.valueOf(in.next().trim().toUpperCase());
        System.out.println("Enter package name: ");
        String name = in.next();
        System.out.println("Enter package volume: ");
        double volume = in.nextDouble();
        System.out.println("Enter package mass: ");
        double mass = in.nextDouble();
        Package pack = new Package(name, volume, mass);
        Transport t = null;
        while (t == null) {
            System.out.println("Enter transport: ");
            String transport = in.next().trim().toLowerCase();
            switch (transport) {
                case "train":
                    t = new Train();
                    break;
                case "car":
                    t = new Car();
                    break;
                case "plane":
                    t = new Plane();
                    break;

            }
        }
        System.out.println(t.deliverPackage(pack, cityFrom, cityTo));
    }
}
