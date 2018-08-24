package com.company.practice.linkedlist;

public abstract class Animal {
    private String name;
    private int age;
    private String breed;
    private int playfulness;
    private int laziness;

    public Animal(String name, int age, String breed, int playfulness, int laziness) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.playfulness = playfulness;
        this.laziness = laziness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getPlayfulness() {
        return playfulness;
    }

    public void setPlayfulness(int playfulness) {
        this.playfulness = playfulness;
    }

    public int getLaziness() {
        return laziness;
    }

    public void setLaziness(int laziness) {
        this.laziness = laziness;
    }

    public String toString() {
        return "---------------------------" +
                "Name:\t" + this.name +
                "\nAge:\t" + this.age +
                "\nBreed:\t" + this.breed +
                "\nLaziness:\t" + this.laziness +
                "\nPlayfulness:\t" + this.playfulness;
    }
}
