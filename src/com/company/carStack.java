package com.company;

import java.util.Stack;

public class carStack {
    private Stack<Car> garage = new Stack<>();
    // Number of cars in the garages
    private int cars;
    // Every cars unique ID
    private int carID;
    // Garage number of each of (3) garages
    private static int garageNum = 1;


    public carStack(){

    }

    public int parkedCars(){
    }

    public boolean isEmpty(){
    }

    public void push(){
    }

    public int pop() {
    }

    public int peek(){
    }

    @Override
    public String toString() {
        return "[ " + " #cars: " + cars + " carID: " + carID +" ]";
    }
}
