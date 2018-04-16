package com.company;


public class Main {
    
    // TODO: 4/14/18 What are the id(s) of cars with only ONE occupant?
    // TODO: 4/14/18 How many [C] colored cars are in the HOV lane?

    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========");

        // Milestone 1
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(5);

        //4/14/18 How many cars are in HOV Lane?
        System.out.println(lane.size());
        System.out.println("hov lane: " + lane);


    }
}
