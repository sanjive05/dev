package com.dsa.LinkedList;

import java.util.Iterator;

public class LinkedListImpl<T> implements Iterable<T>{
	class Node{
		
		T data;
		Node next;
        public Node(T val) {
        	this.data = val;
			
		}
        public Node() {
        	
        }
		
	}
	
	private Node head;
	private int size;
	
	public LinkedListImpl() {
		head = null;
	}
	
	public void insertAtBegin(T val) {
		Node newNode = new Node(val);
		size++;
		newNode.next = head;
		head = newNode;
		
	}
	public void add(T val) {
		Node newNode = new Node(val);
		size++;
		if(head==null) {
			head = newNode;
			
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void insert(int pos, T val) {
		if(pos>size) {
			throw new ArrayIndexOutOfBoundsException("Position not correct...");
		}
		if(pos==0) {
			insertAtBegin(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i=0;i<pos-1;i++) {
			if(temp==null) {
				throw new ArrayIndexOutOfBoundsException("Position not correct...");

			}
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	
	}
	
	public void delete(int pos) {
		if(pos>size) {
			throw new ArrayIndexOutOfBoundsException("Position not correct...");
		}
		
		if(pos==0) {
			head=head.next;
		}
		
        Node temp = head;	
        Node prev = head;
		for(int i=0;i<pos;i++) {
			if(temp==null) {
				throw new ArrayIndexOutOfBoundsException("Position not correct...");

			}
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
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
	}
	public int size() {
		return this.size;
	}
	public void reverse() {
		Node current = head, prev = null, next = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			
			Node temp = head;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return temp !=null;
			}

			@Override
			public T next() {
				T val = (T) temp.data;
				temp = temp.next;
				return val;
			}
			
		};
	}
	
	
	

}
