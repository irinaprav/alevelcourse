package com.company.practice.linkedlist;

public class Cat extends Animal {
    private static final String VOICE = "MEOW";
    private double clawLength;

    Cat() {
        this("Kessy", 4, "British", 2, 4, 1.1);
    }

    public Cat(String name, int age, String breed, int playfulness, int laziness, double clawLength) {
        super(name, age, breed, playfulness, laziness);
        this.clawLength = clawLength;
    }

    public double getClawLength() {
        return clawLength;
    }

    public void setClawLength(double clawLength) {
        this.clawLength = clawLength;
    }

    public String toString() {
        return super.toString() + "\nVoice:\t" + VOICE +
                "\nClaw length?:\t" + this.clawLength;
    }

}
