package com.company;

import java.util.ArrayList;
import java.util.Random;

public class HOV2 {
    private Car head;
    private HOV2 next;


    public HOV2(Car head) {
        this.head = head;
        this.next = null;
    }

    public HOV2(int data) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");
        colors.add("blue");
        Random random = new Random();
        for (int i = 0; i < data; i++) {
            this.head = new Car(random.nextInt(7) + 1, colors.get(random.nextInt(3)), random.nextInt(1000));
            this.append(head);
        }
    }

    public void append(Car car) {
        HOV2 temp = this;
        while (temp.next != null)
            temp = temp.next;
        temp.next = new HOV2(car);
    }

    public Car getHead() {
        return head;
    }

    public void setHead(Car head) {
        this.head = head;
    }

    public HOV2 getNext() {
        return next;
    }

    public void setNext(HOV2 next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return head + " ====> " + next;
    }
}
