package com.jsp.linkedlist;

public class LinkedList {
Node head;
void insert(int ele) {
	Node n=new Node(ele);
	if(head==null) {
		head=n;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n;
	}
	System.out.println("node added with values: "+ele);
}
void display() {
	if(head==null) {
		System.out.println("linked list is empty");
	}
	else {
		System.out.println("===linked list elements=====");
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			System.out.println(temp.next);    //to print the address of the node
			temp=temp.next;
		}
		System.out.println(temp.data);
		System.out.println("==================");
	}
}
void delete() {
	if(head==null) {
		System.out.println("linked list is empty");
	}
else {
	
	
}
	
}
void insertFront(int ele) {
	Node n=new Node(ele);
	if(head==null) {
		head=n;
	}
	else {
		n.next=head;
		head=n;
	}
}
int count() {
	if(head==null) {
		return 0;
	}
	else {
		int c=0;
		Node temp=head;
		while(temp.next!=null) {
			c++;
		}
		c++;
		return c;
	}
}
void insertBetween(int ele,int pos) {
	Node n=new Node(ele);
	if(pos>count()) {
		System.out.println("invalid position");
	}
	else if(pos==1) {
		insertFront(ele);
	}
	else {
		int c=2;
		Node temp=head;
		while(temp.next!=null) {
			if(c==pos) {
				break;
			}
			temp=temp.next;
			c++;
		}
		n.next=temp.next;
		temp.next=n;
		System.out.println("node added with value:"+ele);
	}
}
}
