package com.company.hometask.substance;

public abstract class AbstractSubstance implements Substance {

    private int temperature = 20;

    public State heatUp(double temperature) {
        this.temperature += temperature;
        if (this.temperature >= boiling()) {
            return State.GAS;
        } else if (this.temperature <= melting()) {
            return State.SOLID;
        } else {
            return State.LIQUID;
        }
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    protected abstract double melting();

    protected abstract double boiling();
}
