package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ParkingLot {
    private ArrayList<CarRiser> risers = new ArrayList<>();

    ParkingLot(int num){
        Random random = new Random();
        int number = random.nextInt(10);
        for (int i = 0; i < num; i++) {
            risers.add(new CarRiser());
        }
    }

    @Override
    public String toString() {
        return risers + "";
    }
}
