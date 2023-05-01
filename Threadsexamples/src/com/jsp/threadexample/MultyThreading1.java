package com.jsp.threadexample;

public class MultyThreading1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultyThreading1 m=new MultyThreading1();
		m.start();
		MultyThreading1 m1=new MultyThreading1();
		m1.start();
	}
}
