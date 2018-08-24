package com.company.hometask.substance;

public class Water extends AbstractSubstance {


    @Override
    protected double melting() {
        return 0;
    }

    @Override
    protected double boiling() {
        return 100;
    }
}
