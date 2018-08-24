package com.company.module.oop1;

abstract class Wagon {
    private int capacity;

    Wagon() {

    }

    Wagon(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
