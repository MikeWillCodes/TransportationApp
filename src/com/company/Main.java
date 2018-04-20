package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println("========== Hello, User! ===========\n");

        // Milestone 1 COMPLETE
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(20);
        HOV lane2 = lane.split(12);



        //4/14/18 How many cars are in HOV Lane?
        System.out.println("Number of [N] cars in HOV lane: " + lane.size());
        System.out.println("HOV lane: " + lane);

        // 4/18/18 if HOV lane has [N] cars open up second HOV lane
        System.out.println("HOV lane2: " + lane2);

        // 4/14/18 What are the id(s) of cars with only ONE occupant?
        ArrayList<Integer> Ids = lane.isCarId(1);
        System.out.println("\nID's of cars with [N] passengers 1: " + Ids);

        ArrayList<Integer> Ids2 = lane2.isCarId(1);
        System.out.println("ID's of cars with [N] passengers 2: " + Ids2);

        // How many [C] colored cars are in the HOV lane?
        ArrayList<String> colors = lane.isCarColor("white");
        System.out.println("# of cars with [C] color in lane 1: " + colors.size());

        ArrayList<String> colors2 = lane2.isCarColor("white");
        System.out.println("# of cars with [C] color in lane 2: " + colors2.size());

        // TODO: 4/18/18 what was the most # of cars in lane [H] // Output total # of cars in each lane


        // TODO: 4/18/18 was it ever true HOV lan [A] and [B] had the same number of cars? BOOLEAN // if both ever had [N] cars
    }
}
