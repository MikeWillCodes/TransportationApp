package com.company;

import java.util.Stack;

public class carStack {
    // Stack the cars will be stored in. All methods will have access
    // to the stack that's why its in the class not constructor
    private Stack<Car> garage = new Stack<>();
    // Number of cars in the garages
    private int cars;
    // ID for garage
    private int id;
    // Garage number of each of (3) garages, static because I can call it
    // without creating an object it belongs to
    private static int garageNum = 0;


    public carStack(){
        this.id = garageNum;
        garageNum++;
    }

    public int parkedCars(int data){
        return cars;
    }

    public boolean isEmpty(){
        if (cars == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Car push(Car car){
        cars++;
        garage.add(car);
        return garage.push(car);
    }

    public Car pop() {
        cars--;
        return garage.pop();
    }

    public Car peek(){
        return garage.lastElement();
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getGarageNum() {
        return garageNum;
    }

    public static void setGarageNum(int garageNum) {
        carStack.garageNum = garageNum;
    }

    @Override
    public String toString() {
        return "( Cars: " + cars + ", GarageId: " + id + ")";
    }
}
