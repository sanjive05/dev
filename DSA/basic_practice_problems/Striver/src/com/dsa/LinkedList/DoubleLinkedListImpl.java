package com.dsa.LinkedList;

import com.dsa.LinkedList.LinkedListImpl.Node;

public class DoubleLinkedListImpl<T> {
	class Node {
		T data;
		Node prev;
		Node next;
		
		public Node(T data) {
			this.data = data;
			
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoubleLinkedListImpl() {
		head = null;
		tail = null;
	}
	
	public void insertAtBegin(T data) {
		Node newNode= new Node(data);
		newNode.next = head;
		if(head != null) {
		head.prev = newNode;
		}
		if(head == null) {
			tail = newNode;
		}
		
		head = newNode;
		size++;
	}
	
	public void add(T data) {
		Node newNode = new Node(data);
		Node temp = head;
		if(head == null) {
			insertAtBegin(data);
			return;
		}
		
		while(temp.next !=null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
		tail = newNode;
		size++;
	}
	
	public void insert(int pos, T data) {
		if(pos>size) {
			throw new ArrayIndexOutOfBoundsException("Position not correct...");
		}
		if(pos==0) {
			insertAtBegin(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		if(temp.next !=null) {
		temp.next.prev = newNode;
		}
		newNode.prev = temp;
		temp.next = newNode;
		size++;
	}
	
	public void delete(int pos) {
		if(pos>size) {
			throw new ArrayIndexOutOfBoundsException("Position not correct...");
		}
		
		Node temp = head;
		if(pos==0) {
			head = head.next;
			head.prev = null;
			size--;
			return;
		}
        if(pos == size-1) {
        	tail.prev.next = null;
        	tail = tail.prev;	
        	size--;
        	return;
		}
		for(int i=0;i<pos;i++) {
			temp = temp.next;
		}
		
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		size--;
	}
	
	public void display() {
        Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
		
        temp = tail;
        
        
		
		while(temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.prev;
		}
		System.out.print("null");
		System.out.println();
		
		
	}
	
	
}
