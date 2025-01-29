package com.dsa.LinkedList;

public class DoubleLinkedListImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedListImpl<Integer> list = new DoubleLinkedListImpl<Integer>();
		list.insertAtBegin(45);
		list.insertAtBegin(23);
		list.insertAtBegin(12);
		list.display();
		list.add(111);
		list.insert(3, 3);
		System.out.println("Before delete ");
		list.display();
		list.delete(4);
		System.out.println("After delete ");
		list.display();
	}

}
