package com.dsa.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable{

    private T[] arr;
    private int size;
    private int capacity;
    private static  final int intialCapacity = 2;

    public DynamicArray(){
        size=0;
        arr= (T[]) new Object[intialCapacity];
        capacity = intialCapacity;

    }

    public void add(T val) {
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

    public void insertAtPos(int index, T val) {
        if(index>size){
            throw new ArrayIndexOutOfBoundsException("Invalid position");
        }
        if(capacity==size){
            expandCapacity();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=val;
        size++;
    }

    public void deleteAtPos(int pos) {
        for(int i=pos;i<=size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        shrinkArray();
    }
    private void shrinkArray(){
        if(capacity > intialCapacity && capacity >3*size){
            capacity/=2;
            arr=Arrays.copyOf(arr,capacity);
        }
    }
    public int length(){
        return size;
    }

    public void deleteAtEnd() {
        size--;
    }

    public void deleteFromBegin() {
        for(int i=0;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
        shrinkArray();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }
    public void display1(){
        for(T i:arr){
            System.out.println(i+" ");

        }
    }
}
