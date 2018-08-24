package com.company.practice.delivery;

abstract public class Transport {

    public String deliverPackage(Package pack, City from, City to) {
        return "Package was delivered from " +
                from.name() + " to " + to.name() + " with name: " + pack.getName() +
                " volume: " + pack.getVolume() + " mass: " + pack.getMass() +
                " with cost: " + getCost(pack.getVolume(), pack.getMass()) + " by " + getName();
    }

    public double getCost(double value, double mass) {
        
        return Math.rint((value * mass * getCoficient()*100))/100;
    }

    abstract int getCoficient();

    abstract String getName();

}
