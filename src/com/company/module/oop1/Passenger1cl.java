package com.company.module.oop1;

public class Passenger1cl extends Wagon {
    Passenger1cl() {
        this(0);
    }

    Passenger1cl(int capacity) {
        super(capacity);
    }

    public String toString() {
        return "passenger1cl wagon";
    }
}
