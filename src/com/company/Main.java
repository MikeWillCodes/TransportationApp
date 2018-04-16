package com.company;


public class Main {



    // Milestone 1
    // TODO: 4/14/18 Create user defined LL for HOV lane
    // TODO: 4/14/18 How many cars are in HOV Lane?
    // TODO: 4/14/18 What are the id(s) of cars with only ONE occupant?
    // TODO: 4/14/18 How many [C] colored cars are in the HOV lane?



    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========");



        HOV lane = new HOV(7);
        System.out.println(lane.size());
        System.out.println("hov lane: " + lane);


    }
}
