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

    public int checkCarForPassengerThenGetId(int id){
        Car car = this;
        if (car.passenger == 1){
            return id;
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
