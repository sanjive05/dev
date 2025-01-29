package com.dsa.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplTest {
	public static void main(String[] args) {
		LinkedListImpl<Double> list = new LinkedListImpl<>();
	
		list.insertAtBegin(4.2);
		list.insertAtBegin(0.3);
		list.insertAtBegin(12.5);
		list.add(22.8);
		list.add(54.6);
		System.out.println(list.size());
		list.insert(0, 111.1);
		list.delete(0);
		list.display();
		list.reverse();
		list.display();
	
		
		
	}
}
