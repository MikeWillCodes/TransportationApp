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
        int counter = 0;
        Valet temp = this;
        if (temp == null)
            return 0;
        while (temp != null) {
            counter++;
        }
        return counter;
    }

    @Override
    public String toString() {
        return "Valet: " + carStackArrayList;
    }

    public void add(int i, String brand) {
        ArrayList<String> brands = new ArrayList<>();
        brands.add("Toyota");
        brands.add("Lexus");
        brands.add("Cadillac");
        brands.add("Ford");
        brands.add("Toyota");
        brands.add("Mercedes");
        brands.add("BMW");
        Random rand = new Random();
        for (int j = 0; j < i ; j++) {
            this.add(rand.nextInt(3), brands.get(rand.nextInt(6)));
        }

    }
}
