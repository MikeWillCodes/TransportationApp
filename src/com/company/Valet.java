package com.company;

import java.util.ArrayList;

public class Valet {
    private ArrayList<carStack> carStackArrayList = new ArrayList<>();

    public Valet(int data){
        for (int i = 0; i < data ; i++) {
            carStackArrayList.add(new carStack());
        }
    }

    @Override
    public String toString() {
        return "Valet: " + carStackArrayList;
    }
}
