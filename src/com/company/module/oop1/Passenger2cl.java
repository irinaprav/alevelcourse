package com.company.module.oop1;

public class Passenger2cl extends Wagon {
    Passenger2cl(){
        this(0);
    }

    Passenger2cl(int capacity) {
        super(capacity);
    }

    public String toString() {
        return "passenger2cl wagon";
    }
}
