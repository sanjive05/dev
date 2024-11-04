package com.dsa.linkedlist;

public class LinkedList {
    Node head;

    public void deleteAtPos(int pos) {
        Node temp = head , prev = null;
        for(int i=0;i<pos;i++){
            if(temp==null){
                throw new IllegalArgumentException("Invalid Position...");
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }


    class Node{
        int data;
        Node next;
        public Node(int val){
            this.data=val;
        }
    }
    public LinkedList(){
        head=null;
    }
    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head= newNode;
        }

    }
    public void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        if(pos==0){
            insertAtBegin(val);
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            if(temp==null){
                throw new IllegalArgumentException("Invalid Position  "+pos);
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

}
