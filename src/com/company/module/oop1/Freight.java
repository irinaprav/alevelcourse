package com.company.module.oop1;

public class Freight extends Wagon {
    Freight() {
        this(0);
    }

    Freight(int capacity) {
        super(capacity);
    }

    public String toString() {
        return "freight wagon ";
    }
}
