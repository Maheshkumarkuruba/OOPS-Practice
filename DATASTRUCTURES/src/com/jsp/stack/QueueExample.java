package com.jsp.stack;

public class QueueExample {
	static int[]queue;
	static int front;
	static int rear;
	static int capacity;
	static void creatQueue(int size) {
		queue=new int[size];
		front =0;rear =0;capacity=0;
	}

	static void enqueue(int ele) {
		if(rear==queue.length) {
			System.out.println("queue is full");
		}
		else {
			queue[rear]=ele;
			rear++;
			capacity++;
		}
	}
	static void dequeue() {
		if(rear==front) {
			System.out.println("it is empty");
		}
		else {
			for(int i=0;i<rear-1;i++) {
				queue[i]=queue[i+1];
				rear--;
				capacity--;
			}
		}
	}
	static boolean isEmpty() {
		if(capacity==0) {
			return true;
		}
		return false;
	}
	static int peek() {
		if(isEmpty()!=true) {
			return queue[front];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
