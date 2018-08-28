package com.company.practice.hippodrom;

import java.util.ArrayList;

public class Hippodrom {
    private int roadLength;
    private String name;
    private ArrayList<Horse> horses;
    private volatile ArrayList<String> finish;
    private int finishScore = 4;

    public Hippodrom(String name, int roadLength) {
        this.name = name;
        this.roadLength = roadLength;
        this.horses = new ArrayList<>();
        this.finish = new ArrayList<>();
    }

    public Hippodrom(int roadLength, ArrayList<Horse> horses) {
        this.roadLength = roadLength;
        this.horses = horses;
    }

    public void Horse(Horse hourse) {
        this.horses.add(hourse);
    }

    public synchronized void addFinishHourse(String hourse) {
        this.finish.add(hourse);
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public ArrayList<String> getFinishHorses() {
        return finish;
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public boolean fin() {
        boolean finnalle;
        while (true) {
            int tmp = 0;
            for (Horse hourse : getHorses()) {
                if (!hourse.isAlive()) {
                    tmp++;
                }
            }
            if (tmp == finishScore) {
                finnalle = true;
                break;
            }
        }
        return finnalle;
    }

    public void setRoadLength(int roadLength) {
        this.roadLength = roadLength;
    }

    public String getWinner() {
        return finish.get(0);
    }

}
