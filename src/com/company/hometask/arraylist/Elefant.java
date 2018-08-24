package com.company.hometask.arraylist;

public class Elefant extends Animal {
    private double lengthOfTrunk;
    private double lengthOfEars;
    private double width;

    public Elefant(String name, int age, String breed, int playfulness, int laziness, double lengthOfTrunk, double lengthOfYears, double width) {
        super(name, age, breed, playfulness, laziness);
        this.lengthOfTrunk = lengthOfTrunk;
        this.lengthOfEars = lengthOfYears;
        this.width = width;
    }

    public double getLengthOfTrunk() {
        return lengthOfTrunk;
    }

    public void setLengthOfTrunk(double lengthOfTrunk) {
        this.lengthOfTrunk = lengthOfTrunk;
    }

    public double getLengthOfYears() {
        return lengthOfEars;
    }

    public void setLengthOfYears(double lengthOfYears) {
        this.lengthOfEars = lengthOfYears;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return super.toString() +"\nLength of Trunk:\t" + this.lengthOfTrunk +
                "\nLength of Ears:\t" + this.lengthOfEars +
                "\nWidth:\t" + this.width;
    }
}
