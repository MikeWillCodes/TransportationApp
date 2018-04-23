package com.company;


import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class Main {


    public static void main(String[] args) {
        System.out.println("<========== Hello User! ===========>\n");

        // Milestone 1 COMPLETE
        // 4/14/18 Create user defined LL for HOV lane
        HOV lane = new HOV(20);
        HOV lane2 = lane.split(12);


        //4/14/18 How many cars are in HOV Lane?
        System.out.println("Number of [N] cars in HOV lane: " + lane.size());
        System.out.println("HOV lane: " + lane);


        // 4/18/18 if HOV lane has [N] cars open up second HOV lane
        System.out.println("Number of [N] cars in HOV lane: " + lane2.size());
        System.out.println("HOV lane2: " + lane2);

        // 4/18/18 what was the most # of cars in lane [H] // Output total # of cars in each lane
        int sum = lane.size() + lane2.size();
        System.out.println("The total numbers of cars: " + sum);

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

        // 4/18/18 was it ever true HOV lan [A] and [B] had the same number of cars? BOOLEAN // if both ever had [N] cars
        System.out.println("Was it ever true HOV lane [A] and [B] had the same number of cars?: " + lane.isLaneSizeSame(lane2));

        carStack garage = new carStack();
        System.out.println("\n" + garage);
        System.out.println("Is garage empty?: " + garage.isEmpty());

        Car car = new Car(1,"White",33);
        Car car1 = new Car(2,"Black",11);
        Car car2 = new Car(3,"Red",12);
        Car car3 = new Car(4,"White",5);
        Car car4 = new Car(5,"Red",6);
        Car car5 = new Car(6,"Black",3);
        Car car6= new Car(7,"Black",7);
        Car car7= new Car(1,"Red",4);
        Car car8= new Car(3,"Blue",3);
        Car car9= new Car(5,"Blue",9);
        Car car10= new Car(2,"Blue",8);


        Stack<Car> riser = new Stack<>();
        riser.push(car);
        riser.push(car1);
        riser.push(car2);
        riser.push(car3);
        riser.push(car4);
        riser.push(car5);
        riser.push(car6);

        System.out.println("\n Riser: " + riser + "\n");

        Random random = new Random();
        Valet lots = new Valet(3);
        lots.add(random.nextInt(3) +1,car);
        lots.add(random.nextInt(3) +1,car1);
        lots.add(random.nextInt(3) +1,car2);
        lots.add(random.nextInt(3) +1,car3);
        lots.add(random.nextInt(3) +1,car4);
        lots.add(random.nextInt(3) +1,car5);
        lots.add(random.nextInt(3) +1,car6);
        lots.add(random.nextInt(3) +1,car7);
        lots.add(random.nextInt(3) +1,car8);
        lots.add(random.nextInt(3) +1,car9);
        lots.add(random.nextInt(3) +1,car10);
        System.out.println( "What's in our (" + lots.size() + ") lots? " + lots );


        garage.push(1,car1);



    }
}
