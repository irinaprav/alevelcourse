package com.company.module.oop1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TrainDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("From City:");
        City cityFrom = City.valueOf(in.next().trim().toUpperCase());
        City cityTo;
        while (true) {
            System.out.println("City To:");
            cityTo = City.valueOf(in.next().trim().toUpperCase());
            if (!cityFrom.name().equals(cityTo.name())) break;
        }
        System.out.println("How much wagons:");
        int wagonsAmount = 0;
        do {
            try {
                wagonsAmount = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Try again...");
                in.next();
                continue;
            }
        } while (wagonsAmount == 0);
        int wagonsChoice = 0;
        Train train = new Train(cityFrom, cityTo, cityFrom.name() + " - " + cityTo.name(), wagonsAmount);
        while (wagonsChoice != 4) {
            System.out.println("---ADDING WAGONS---");
            System.out.println("1.\tFreight wagon");
            System.out.println("2.\tPassengers 1 class wagon");
            System.out.println("3.\tPassengers 2 class wagon");
            System.out.println("4.\tExit");
            do {
                try {
                    wagonsChoice = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Try again...");
                    in.next();
                    continue;
                }
            } while (wagonsChoice == 0);
            int howMuch = 0;
            switch (wagonsChoice) {
                case 1:
                    System.out.println("How Much?");
                    howMuch = in.nextInt();
                    if (train.getWagonsAmount() < (train.getWagons().size() + howMuch))
                        throw new IndexOutOfBoundsException();
                    train.addWagonWithCapacity(howMuch, new Freight(), random.nextInt(100));
                    break;
                case 2:
                    System.out.println("How Much?");
                    howMuch = in.nextInt();
                    if (train.getWagonsAmount() < (train.getWagons().size() + howMuch))
                        throw new IndexOutOfBoundsException();
                    train.addWagonWithCapacity(howMuch, new Passenger1cl(), random.nextInt(100));
                    break;
                case 3:
                    System.out.println("How Much?");
                    howMuch = in.nextInt();
                    if (train.getWagonsAmount() < (train.getWagons().size() + howMuch))
                        throw new IndexOutOfBoundsException();
                    train.addWagonWithCapacity(howMuch, new Passenger2cl(), random.nextInt(100));
                    break;
            }

        }
        System.out.println(train.toString());

    }
}
