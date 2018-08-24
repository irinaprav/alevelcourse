package com.company.hometask.arithmeticprogression;

public class ArithmeticProgression {

    private final int initial;
    private final int step;

    ArithmeticProgression(int initial, int step) throws ProgressionConfigurationException {
        if (step == 0) throw new ProgressionConfigurationException("Step cannot be equals 0! Try again!");
        this.initial = initial;
        this.step = step;
    }

    int calculate(int n) throws ProgressionConfigurationException {
        if (n <= 0) throw new ProgressionConfigurationException("N cannot be <= 0! Try again!");
        return initial + step * (n - 1);
    }

}
