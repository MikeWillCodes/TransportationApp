package com.company;


import java.util.ArrayList;

public class Main {

    // TODO: 4/14/18 What are the id(s) of cars with only ONE occupant?
    // TODO: 4/14/18 How many [C] colored cars are in the HOV lane?

    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========\n");

        // Milestone 1
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(5);

        //4/14/18 How many cars are in HOV Lane?
        System.out.println("Number of cars in HOV lane: " + lane.size());
        System.out.println("HOV lane: " + lane);


        ArrayList<Integer> Ids = lane.isCarIdAvailable(1);
        System.out.println("ID's of cars with [N] passengers" + Ids);


    }
}
