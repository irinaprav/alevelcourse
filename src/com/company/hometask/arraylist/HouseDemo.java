package com.company.hometask.arraylist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HouseDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuChoice = 0;
        while (menuChoice!=5) {
            System.out.println("--WELCOME TO THE HOUSECREATOR--");
            System.out.println("1.\tCreate home with cats:");
            System.out.println("2.\tCreate home with dogs:");
            System.out.println("3.\tCreate home with humsters:");
            System.out.println("4.\tCreate home with elefants:");
            System.out.println("5.\tEXIT");
            System.out.println("Make choice:");
            do {
                try {
                    menuChoice = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Try again...");
                    in.next();
                    continue;
                }
            } while (menuChoice == 0);
            switch (menuChoice) {
                case 1:
                    House<Cat> catHouse = new House<Cat>(500, 400);
                    fillWithCats(catHouse.getDwellers());
                    catHouse.getDwellers().printList();
                    break;
                case 2:
                    House<Dog> dogHouse = new House<Dog>(1500, 600);
                    fillWithDogs(dogHouse.getDwellers());
                    dogHouse.getDwellers().printList();
                    break;
                case 3:
                    House<Humster> humsterHouse = new House<Humster>(400, 100);
                    fillWithHumsters(humsterHouse.getDwellers());
                    humsterHouse.getDwellers().printList();
                    break;
                case 4:
                    House<Elefant> elefantHouse = new House<Elefant>(30000, 20000);
                    fillWithElefants(elefantHouse.getDwellers());
                    elefantHouse.getDwellers().printList();
                    break;
            }

        }
    }

    public static void fillWithCats(MyArrayList<Cat> cats) {
        cats.add(new Cat("Tomas", 3, "British", 2, 2, 2));
        cats.add(new Cat("Taison", 3, "Percia", 5, 1, 1));
        cats.add(new Cat("Tisha", 3, "Siam", 6, 1, 12));
        cats.add(new Cat("Loly", 3, "Smth", 1, 9, 5));
        cats.add(new Cat("Nana", 3, "Else", 9, 2, 10));
    }

    public static void fillWithDogs(MyArrayList<Dog> dogs) {
        dogs.add(new Dog("Baks", 3, "German", 2, 2, "White", 4));
        dogs.add(new Dog("Jack", 3, "Doberman", 5, 1, "Brown", 6));
        dogs.add(new Dog("Deni", 3, "Labrador", 6, 1, "Grey", 7));
    }

    public static void fillWithElefants(MyArrayList<Elefant> elefants) {
        elefants.add(new Elefant("Elli", 3, "Asia", 2, 2, 2, 4, 6));
        elefants.add(new Elefant("Mai", 3, "Africa", 5, 1, 1, 1, 6));
    }

    public static void fillWithHumsters(MyArrayList<Humster> humsters) {
        humsters.add(new Humster("Elvin", 3, "1", 2, 2, 2, true));
        humsters.add(new Humster("Bonya", 3, "2", 5, 1, 1, false));
        humsters.add(new Humster("Pim", 3, "4", 6, 1, 12, true));
        humsters.add(new Humster("Pol", 3, "5", 1, 9, 5, false));
        humsters.add(new Humster("Bol", 3, "6", 9, 2, 10, false));
    }

}
