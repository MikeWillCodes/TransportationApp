package com.company;

import java.util.Stack;

public class CarRiser {
    private Stack<Car> parking = new Stack<>();
    private int numOfCars;
    private int id;
    private static int riserId = 1;

    public CarRiser(){
        this.id = riserId;
        riserId++;
    }
    private void push(Car car){
        numOfCars++;
        parking.push(car);
    }

}
