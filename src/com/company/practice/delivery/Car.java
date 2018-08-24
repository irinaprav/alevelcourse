package com.company.practice.delivery;

public class Car extends Transport {

    @Override
    int getCoficient() {
        return 2;
    }

    @Override
    String getName() {
        return "Car";
    }
}
