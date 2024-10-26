package com.dsa.linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(4);
        list.insertAtBegin(5);
        list.insertAtBegin(23);
        list.insertAtPos(1,65);
        list.insertAtPos(3,78);
        list.insertAtPos(5,8);
        list.display();
    }
}
