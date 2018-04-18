package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========\n");

        // Milestone 1
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(5);

        //4/14/18 How many cars are in HOV Lane?
        System.out.println("Number of [N] cars in HOV lane: " + lane.size());
        System.out.println("HOV lane: " + lane);

        // 4/14/18 What are the id(s) of cars with only ONE occupant?
        ArrayList<Integer> Ids = lane.isCarId(1);
        System.out.println("ID's of cars with [N] passengers" + Ids);

        // How many [C] colored cars are in the HOV lane?
        ArrayList<String> colors = lane.isCarColor("white");
        System.out.println("# of cars with [C] color: " + colors.size());
    }
}
