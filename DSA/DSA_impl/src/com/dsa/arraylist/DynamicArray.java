package com.dsa.arraylist;

import java.util.Arrays;

public class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;
    private static  final int intialCapacity = 16;

    public DynamicArray(){
        size=0;
        arr=new int[16];
        capacity = intialCapacity;

    }

    public void add(int val) {
        if(size==capacity){
            expandCapacity();
        }
        arr[size++] = val;
    }

    private void expandCapacity() {
        capacity*=2;
        arr= Arrays.copyOf(arr,capacity);
    }

    public void display() {
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public void insertAtPos(int index, int val) {
        for(int i=size+1;i>=index;i--){
            arr[i]=arr[i-1];
            System.out.println(i);
        }
        arr[index]=val;
        size++;
    }

    public void deleteAtPos(int i) {
    }
}
