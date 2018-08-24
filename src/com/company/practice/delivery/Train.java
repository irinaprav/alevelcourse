package com.company.practice.delivery;

public class Train extends Transport {

    @Override
    int getCoficient() {
        return 1;
    }

    @Override
    String getName() {
        return "Train";
    }
}
