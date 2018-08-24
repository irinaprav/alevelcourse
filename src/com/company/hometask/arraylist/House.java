package com.company.hometask.arraylist;

public class House<T extends Animal> {
    private MyArrayList<T> dwellers;
    private int amountOfDwellers;
    private double width;
    private double height;

    public House(double weight, double height) {
        this.dwellers = new MyArrayList<T>();
        this.amountOfDwellers = this.dwellers.size();
        this.width = weight;
        this.height = height;
    }

    public MyArrayList<T> getDwellers() {
        return dwellers;
    }

    public void setDwellers(MyArrayList<T> dwellers) {
        this.dwellers = dwellers;
    }

    public int getAmountOfDwellers() {
        return amountOfDwellers;
    }

    public void setAmountOfDwellers(int amountOfDwellers) {
        this.amountOfDwellers = amountOfDwellers;
    }

    public double getWeight() {
        return width;
    }

    public void setWeight(double weight) {
        this.width = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
