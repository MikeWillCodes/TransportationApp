package com.company;


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========\n");

        // Milestone 1 COMPLETE
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(5);
        HOV lane2 = new HOV(5);

        //4/14/18 How many cars are in HOV Lane?
        System.out.println("Number of [N] cars in HOV lane: " + lane.size());
        System.out.println("HOV lane: " + lane);

        System.out.println("\nNumber of [N] cars in HOV lane2: " + lane.size());
        System.out.println("HOV lane2: " + lane2);

        // 4/14/18 What are the id(s) of cars with only ONE occupant?
        ArrayList<Integer> Ids = lane.isCarId(1);
        System.out.println("\nID's of cars with [N] passengers: " + Ids);

        // How many [C] colored cars are in the HOV lane?
        ArrayList<String> colors = lane.isCarColor("white");
        System.out.println("# of cars with [C] color: " + colors.size());

        // Milestone 2
        // TODO: 4/18/18 if HOV lane has [N] cars open up second HOV lane
        // TODO: 4/18/18 what was the most # of cars in lane [H] // Output total # of cars in each lane
        // TODO: 4/18/18 was it ever true HOV lan [A] and [B] had the same number of cars? BOOLEAN // if both ever had [N] cars
    }
}
