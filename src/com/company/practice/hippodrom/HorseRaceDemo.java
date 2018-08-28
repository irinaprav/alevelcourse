package com.company.practice.hippodrom;


import java.util.Scanner;

public class HorseRaceDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---WELCOME TO HIPPODROM---");
        Hippodrom hippodrom = new Hippodrom("Luxary", 1000);
        hippodrom.Horse(new Horse("First", hippodrom));
        hippodrom.Horse(new Horse("Second", hippodrom));
        hippodrom.Horse(new Horse("Third", hippodrom));
        hippodrom.Horse(new Horse("Fourth", hippodrom));
        System.out.println("Enter name of winner");
        String winner = in.next();
        for (Horse horse : hippodrom.getHorses()) {
            System.out.println(horse.toString());
        }
        for (Horse horse : hippodrom.getHorses()) {
            horse.start();
        }
        System.out.println("FINISH");
        while (true) {
            hippodrom.fin();
            if (hippodrom.fin()) break;
        }
        for (String horse : hippodrom.getFinishHorses()) {
            System.out.println(horse);
        }

        if (winner.toLowerCase().equals(hippodrom.getWinner().toLowerCase())) System.out.println("YOU HAVE WON");
        else System.out.println("YOU HAVE LOSED");
    }
}
