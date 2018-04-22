package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Valet {
    private ArrayList<carStack> carStackArrayList = new ArrayList<>();

    public Valet(int data){
        for (int i = 0; i < data ; i++) {
            carStackArrayList.add(new carStack());
        }
    }


    public int size(){
       return carStackArrayList.size();
    }

    @Override
    public String toString() {
        return "Valet: " + carStackArrayList;
    }

    public void add(){
    }
}
