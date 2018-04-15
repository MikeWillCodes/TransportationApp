package com.company;

public class HOV {

    public int data;
    public HOV next;

    public HOV(int M){
        data = M;
        next = null;
    }

    @Override
    public String toString() {
        return "HOV Lane:  " + "Cars: " + data + " next: " + next ;
    }
}