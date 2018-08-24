package com.company.hometask.substance;

public class Iron extends AbstractSubstance {

    @Override
    protected double melting() {
        return -10;
    }

    @Override
    protected double boiling() {
        return 600;
    }
}
