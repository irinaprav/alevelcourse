package com.company.hometask.hangleman;

import java.util.Scanner;

public class HangleManDemo {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Making random choice...");
        System.out.println("Hidden word: " + game.newWord());
        String userInput;
        Scanner in = new Scanner(System.in);
        while (game.getAttemts() > 0 && (!game.yourWin())) {
            System.out.println("You have: " + game.getAttemts() + " attempts");
            System.out.println("Enter your symbol:");
            userInput = in.next();
            game.startthegame(userInput.charAt(0));
            System.out.println("Your word is " + game.getUsersWord());
        }
        System.out.println(game.getAttemts() >= 0 && game.yourWin() ? "Great, you win!" : "Sorry, no more attempts, you are hangled:)");
    }
}