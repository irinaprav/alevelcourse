package com.company.practice.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList<Cat> cats = new SinglyLinkedList<Cat>();
        cats.add(new Cat("Tomas", 3, "British", 2, 2, 2));
        cats.add(new Cat("Taison", 3, "Percia", 5, 1, 1));
        cats.add(new Cat("Tisha", 3, "Siam", 6, 1, 12));
        cats.add(new Cat("Tisha", 3, "Siam", 6, 1, 12));
        cats.print();
        System.out.println("------------Delete 1 position");
        cats.delete(1);
        cats.print();
        System.out.println(cats.size() + "-------------Add new at 1 position ");
        cats.add(1, new Cat("Taison", 3, "Percia", 5, 1, 1));
        cats.print();
    }
}
