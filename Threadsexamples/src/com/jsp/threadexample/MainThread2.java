package com.jsp.threadexample;

public class MainThread2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
MainThread2 m =new MainThread2();
Thread t=new Thread(m);
t.start();
	}
}
