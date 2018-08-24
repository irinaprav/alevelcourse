package com.company.hometask.substance;

import java.util.Scanner;

public class SubstanceDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word");
        AbstractSubstance substance = null;
        String currentName = in.next().trim().toLowerCase();
        switch (currentName) {
            case "oxygen":
                substance = new Oxygen();
                break;

            case "water":
                substance = new Water();
                break;

            case "iron":
                substance = new Iron();
                break;
        }

        String userInput;
        while (true) {
            try {
                System.out.println("Enter new Temperature:");
                userInput = in.next();
                double newTemperature = Double.parseDouble(userInput);
                State st = substance.heatUp(newTemperature);
                System.out.println("Substance: " + st + "; Temperature " + substance.getTemperature());
            } catch (NumberFormatException e) {
                break;

            }
        }

    }
}
