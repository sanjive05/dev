package com.dsa.arraylist;

public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(45);
        array.add(5);
        array.add(4);
        array.add(9);
        array.display();
        array.insertAtPos(2,23);
        array.display();
        array.deleteFromBegin();
        array.display();




    }
}
