package com.company;

import java.util.ArrayList;

public class carStack {
    private int arr[];
    private int maxSize;
    int top;

    public carStack(int data){
        maxSize = data;
        arr = new int[maxSize];
        top = 0;
    }

    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int data){
        if (top < maxSize) {
            arr[top] = data;
            top++;
        }
        else {
            System.out.println("Stach Overflow!");
        }
    }

    public int pop(){

    }

    public int peek(){

    }
}
