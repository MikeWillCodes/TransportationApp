package com.company;

public class Car {
    private int data;
    private Car head;
    private Car next;

    public Car (int data){
        head = new Car(data);
    }

    public Car (Car node){
        head = node;

        Car temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = new Car(data);
    }

    public Car next(){
        if (head.next == null)
            return null;

        return new Car(head.next);
    }

    @Override
    public String toString(){
        if (head.next == null)
            return Integer.toString(head.data);
        else
            return head.data + "-" + next().toString();
    }
}
