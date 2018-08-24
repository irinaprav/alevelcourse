package com.company.module.oop1;

import java.util.ArrayList;

public class Train {
    class Locomotive extends Wagon {
        private double power;
        private double length;

        Locomotive() {
            this(564.35, 658);
        }

        Locomotive(int capacity) {
            super(100);
        }

        Locomotive(double power, double length) {
            this.power = power;
            this.length = length;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String toString() {
            return "locomotive >=";
        }
    }

    private City from;
    private City to;
    private String name;
    private int wagonsAmount;
    private ArrayList<Wagon> wagons;

    public Train(City from, City to, String name, int wagonsAmount) {
        this.from = from;
        this.to = to;
        this.name = name;
        this.wagonsAmount = wagonsAmount;
        this.wagons = new ArrayList<Wagon>(this.wagonsAmount);
        Locomotive locomotive = new Locomotive();
        addWagon(1, locomotive);
    }

    public void addWagon(int howMuch, Wagon wagon) {
        if ((howMuch < 1) || (howMuch > 36)) throw new IllegalArgumentException();
        while (howMuch > 0) {
            this.wagons.add(wagon);
            howMuch--;
        }
    }

    public void addWagonWithCapacity(int howMuch, Wagon wagon, int capacity) {
        if ((howMuch < 1) || (howMuch > 36)) throw new IllegalArgumentException();
        wagon.setCapacity(capacity);
        while (howMuch > 0) {
            this.wagons.add(wagon);
            howMuch--;
        }
    }

    public City getFrom() {
        return from;
    }

    public void setFrom(City from) {
        this.from = from;
    }

    public City getTo() {
        return to;
    }

    public void setTo(City to) {
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWagonsAmount() {
        return wagonsAmount;
    }

    public void setWagonsAmount(int wagonsAmount) {
        this.wagonsAmount = wagonsAmount;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(ArrayList<Wagon> wagons) {
        this.wagons = wagons;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("The train is " + this.getName() + "\n");
        builder.append("The train sheme: " + "\n");
        for (Wagon w : wagons) {
            builder.append("[ " + w.toString());
            if (!(w instanceof Locomotive)) {
                builder.append(" " + w.getCapacity() + "% ] ");
            }
        }
        builder.append(" ]");
        return builder.toString();
    }
}
