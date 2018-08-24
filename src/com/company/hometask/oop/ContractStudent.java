package com.company.hometask.oop;

public class ContractStudent extends Student {
    private double priceforcontract;

    ContractStudent() {
        super();
    }

    ContractStudent(int age, String name, double priceforcontract) {
        super(age, name);
        this.priceforcontract = priceforcontract;
    }

    public double getPriceforcontract() {
        return priceforcontract;
    }

    public void setPriceforcontract(double priceforcontract) {
        this.priceforcontract = priceforcontract;
    }

    public void print() {
        super.print();
        System.out.print("\nPrice:    " + priceforcontract);
    }
}
