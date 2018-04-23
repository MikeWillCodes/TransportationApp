package com.company;

public class Car {
    private int passenger;
    private int id;
    private String color;

    public Car(int passengers, String color, int id) {
        this.passenger = passengers;
        this.color = color;
        this.id = id;
    }

    public String checkForCarColorThenCount( String color){
        Car car = this;
        if (car.color == color){
            return this.color;
        }
        else {
            return "";
        }
    }

    public int checkCarForPassengerThenGetId(int data){
        Car car = this;
        if (car.passenger == data){
            return this.id;
        }
        else {
            return 0;
        }
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "[ Occupants: " + passenger +", Color: "+ color + ", ID: " + id +" ]";
    }
}
