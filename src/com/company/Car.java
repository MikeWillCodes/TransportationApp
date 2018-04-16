package com.company;

public class Car {
    private int passengers;
    private String color;

    public Car(int passengers, String color) {
        this.passengers = passengers;
        this.color = color;
    }

    @Override
    public String toString() {
        return "( " + passengers +" "+ color + " )";
    }
}
