package com.company.practice.delivery;

public class Plane extends Transport {


    @Override
    int getCoficient() {
        return 3;
    }

    @Override
    String getName() {
        return "Plane";
    }
}
