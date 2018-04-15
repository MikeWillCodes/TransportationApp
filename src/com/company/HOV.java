package com.company;

public class HOV {

    private int cars;
    private HOV next;

    HOV(int M){
        cars = M;
        next = null;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public HOV getNext() {
        return next;
    }

    public void setNext(HOV next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HOV Lane:  " + "cars: " + cars + " next: " + next ;
    }
}
