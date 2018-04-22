package com.company;

import java.util.Stack;

public class CarRiser {
    private Stack<Car> parking = new Stack<>();
    private int numOfCars;
    private int id;
    private static int riserId = 1;

    public CarRiser(int numOfCars) {
        this.numOfCars = numOfCars;
        this.id = riserId;
        riserId++;
    }

    private void push(Car car){
        numOfCars++;
        parking.push(car);
    }

    private Car pop(){
        numOfCars--;
        return parking.pop();
    }

    private int getNumOfCars(){
        return numOfCars;
    }

    @Override
    public String toString() {
        return "numOfCars= " + numOfCars + ", id= " + id + '}';
    }
}
