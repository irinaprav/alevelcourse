package com.company.practice.linkedlist;

import java.util.LinkedList;
import java.util.NoSuchElementException;


public class SinglyLinkedList<T> {
    class Node<T> {
        private Node<T> next;
        private T value;

        Node(T value) {
            this.value = value;
        }

        Node(T value, Node<T> next) {
            this.next = next;
            this.value = value;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    private Node<T> head;

    public void add(T value) {
        Node<T> current = this.head;
        Node<T> newNode = new Node<T>(value);
        if (current == null) {
            this.head = newNode;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void add(int index, T element) throws IndexOutOfBoundsException {
        if (index == 0) {
            Node<T> newNode = new Node<T>(element);
            newNode.setNext(this.head);
            this.head = newNode;
        } else if (index < 0) {
            throw new IllegalArgumentException();

        } else {
            if (this.head == null) {
                throw new NoSuchElementException();
            }
            Node<T> current = this.head;
            for (int i = 0; i < index - 1; i++) {
                if (current.getNext() == null) {
                    throw new NoSuchElementException();
                }
                current = current.getNext();
            }
            Node<T> next = current.getNext();
            Node<T> newNode = new Node<>(element, next);
            current.setNext(newNode);

        }

    }

    public int size() {
        int amount = 0;
        Node<T> current = this.head;
        while (current != null) {
            amount++;
            current = current.getNext();
        }
        return amount;
    }

    public void delete(int index) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (this.head == null) {
            throw new NoSuchElementException();
        }
        if(index==0){
            Node<T> tmp = this.head.getNext();
            this.head = tmp;
        }
        Node<T> current = this.head;
        for (int i = 0; i < index - 1; i++) {
            if (current.getNext() == null) {
                throw new NoSuchElementException();
            }
            current = current.getNext();
        }
        if(current.getNext() == null){
            throw new NoSuchElementException();
        }
        Node<T> nextNode = current.getNext().getNext();
        current.setNext(nextNode);

    }

    public void clear() {
        this.head = null;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (this.head == null) {
            throw new NoSuchElementException();
        }
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new NoSuchElementException();
            }
            current = current.getNext();
        }
        return current.value;
    }

    public void set(int index,T element){
        if (index == 0) {
            Node<T> newNode = new Node<T>(element);
            newNode.setNext(this.head);
            this.head = newNode;
            return;
        }
        if (this.head == null) {
            throw new NoSuchElementException();
        }
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) {
                throw new NoSuchElementException();
            }
            current = current.getNext();
        }
        current.setValue(element);
    }

    public boolean contains(T element) {
        boolean nodeWasFound = false;
        Node<T> current = this.head;
        while (current.getNext() != null) {
            if (current.getValue().equals(element)) {
                nodeWasFound = true;
                break;
            }
        }
        return nodeWasFound;
    }

    public void print(){
        Node<T> current = this.head;
        while (current != null) {
            System.out.println(current.getValue().toString());
            current = current.getNext();
        }
    }
}
