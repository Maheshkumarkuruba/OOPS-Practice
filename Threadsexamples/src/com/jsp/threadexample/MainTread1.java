package com.jsp.threadexample;

public class MainTread1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
MainTread1 m=new MainTread1();
m.start();
	}

}
