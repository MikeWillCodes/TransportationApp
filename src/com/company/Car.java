package com.company;

public class Car {

    public int data;
    public Car next;

    public Car (int M){
        data = M;
        next = null;
    }


    @Override
    public String toString() {
        return Integer.toString(data);
    }
}