package com.company;

public class HovLane {
    public Car head;


    public HovLane(int data){
        head = new Car(data);
    }


    public HovLane(Car node){
        head = node;
    }

    public void append(int data){
        Car temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = new Car(data);
    }

    public HovLane next() {
        if (head.next == null)
            return null;
        return new HovLane(head.next);
    }

    @Override
    public String toString() {
        if (head.next == null)
            return Integer.toString(head.data);
        else
            return head.data + "-" + next().toString();
    }
}
