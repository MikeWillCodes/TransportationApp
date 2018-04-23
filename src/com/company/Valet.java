package com.company;

import java.util.ArrayList;
import java.util.Random;


public class Valet {
    private ArrayList<carStack> carStackArrayList = new ArrayList<>();

    Random rand = new Random();
    int num = rand.nextInt(3);

    public Valet(int data){
        for (int i = 0; i < data ; i++) {
            carStackArrayList.add(new carStack());
        }
    }

//    public int findCar(Car car){
//        int id = 0;
//        for (int i = 0; i < carStackArrayList.size() ; i++) {
//         if (carStackArrayList.contains(car)) {
//             id = carStackArrayList.get(i).getId();
//            }
//        }
//        return id;
//    }

    public int size(){
       return carStackArrayList.size();
    }

    public void add(int num, Car car){
        for (int i = 0; i < carStackArrayList.size(); i++) {
        if (carStackArrayList.get(i).getId() == num) {
            carStackArrayList.get(i).push(num, car);
            }
        }
    }

    @Override
    public String toString() {
        return "Valet: " + carStackArrayList;
    }
}
