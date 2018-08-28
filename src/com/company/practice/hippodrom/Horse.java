package com.company.practice.hippodrom;

import java.util.Random;

public class Horse extends Thread {
    static final int SLEEP_MINIMUM = 400;
    static final int SLEEP_MAXIMUM = 500;
    static final int RUNNING_MIN = 200;
    static final int RUNNING_MAX = 300;
    private Hippodrom hippodrom;
    private Random random;
    private int position;

    public Horse(String name, Hippodrom hippodrom) {
        super(name);
        this.hippodrom = hippodrom;
        this.random = new Random();
        this.position = 0;
    }

    @Override
    public void run() {
        startHippodrom();
    }

    public void startHippodrom() {
        do {
            running();
            sleeping();
        } while (position != hippodrom.getRoadLength());
        System.out.println("Horse " + this.getName() + " was finish.");
        this.hippodrom.addFinishHourse(this.getName());
    }

    public void running() {
        int addingPosition = random.nextInt(RUNNING_MAX - RUNNING_MIN) + RUNNING_MIN;
        if (addingPosition + position > hippodrom.getRoadLength()) {
            addingPosition = hippodrom.getRoadLength() - position;
        }
        position += addingPosition;
    }

    private void sleeping() {
        try {
            Thread.sleep(random.nextInt(SLEEP_MAXIMUM - SLEEP_MINIMUM) + SLEEP_MINIMUM);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "Name: " + getName();
    }
}
