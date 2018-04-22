package com.company;

import java.util.ArrayList;

public class ParkingLot {
    private ArrayList<CarRiser> risers = new ArrayList<>();

    ParkingLot(int num){
        for (int i = 0; i < num; i++) {
            risers.add(new CarRiser(5));
        }
    }

    @Override
    public String toString() {
        return "ParkingLot{" + "risers=" + risers + '}';
    }
}
