package com.company.hometask.arraylist;

public class Humster extends Animal {
    private double weight;
    private boolean bites;

    public Humster(String name, int age, String breed, int playfulness, int laziness, double weight, boolean bites) {
        super(name, age, breed, playfulness, laziness);
        this.weight = weight;
        this.bites = bites;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBites() {
        return bites;
    }

    public void setBites(boolean bites) {
        this.bites = bites;
    }

    public String toString() {
        return super.toString() + "\nWeight:\t" + this.weight +
                "\nBites?:\t" + this.bites;
    }
}
