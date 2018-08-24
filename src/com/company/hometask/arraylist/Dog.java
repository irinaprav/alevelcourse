package com.company.hometask.arraylist;

public class Dog extends Animal {
    private static final String VOICE = "WOOF";
    private String color;
    private double lengthOfEars;

    public Dog(String name, int age, String breed, int playfulness, int laziness, String color, double lengthofears) {
        super(name, age, breed, playfulness, laziness);
        this.color = color;
        this.lengthOfEars = lengthofears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLengthofears() {
        return lengthOfEars;
    }

    public void setLengthofears(double lengthofears) {
        this.lengthOfEars = lengthofears;
    }

    public String toString() {
        return super.toString() +"\nVOICE:\t" + VOICE +
                "\nLength of Ears:\t" + this.lengthOfEars +
                "\nColor:\t" + this.color;
    }
}
