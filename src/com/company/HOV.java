package com.company;


import java.util.ArrayList;
import java.util.Random;

public class HOV {
    private Car head;
    private HOV next;

    public HOV(Car head) {
        this.head = head;
        this.next = null;
    }

    public ArrayList<Integer> isCarIdAvailable(int data) {
        HOV temp = this;
        Car car = head;
        ArrayList<Integer> IDs = new ArrayList<>();
        while (temp != null) {
            temp = temp.next;
            if (car.getPassenger() == data) {
                IDs.add(temp.head.getId());
            } else {
                return null;
            }
        }
        return IDs;
    }

    public int size() {
        int counter = 0;
        HOV temp = this;

        if (temp == null)
            return 0;

        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }


    public HOV(int data) {
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
        HOV temp = this;

        while (temp.next != null)
            temp = temp.next;

        temp.next = new HOV(car);
    }

    public Car getHead() {
        return head;
    }

    public void setHead(Car head) {
        this.head = head;
    }

    public HOV getNext() {
        return next;
    }

    public void setNext(HOV next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return head + " ====> " + next;
    }
}
