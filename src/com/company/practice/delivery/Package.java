package com.company.practice.delivery;

public class Package {
    private String name;
    private double volume;
    private double mass;

    Package(String name, double volume, double mass){
        this.name = name;
        this.volume = volume;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}
