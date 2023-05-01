package com.jsp.threadexample;
class Task1{
 public void printAsc() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
public void printDsc() {
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
	}
}
class Threadone extends Thread{
	Task1 t1;
	public Threadone(Task1 t1) {
		this.t1=t1;
	}
	public void run() {
		synchronized(t1) {
	t1.printAsc();	
		}
	}
}
class Threadtwo extends Thread{
	Task1 t2;
	public Threadtwo(Task1 t2) {
		this.t2=t2;
	}
	public void run() {
		synchronized(t2) {
	t2.printDsc();	
		}
	}
}

public class Snchronizedblocks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Task1 t=new Task1();
Threadone th1=new Threadone(t);
Threadtwo th2=new Threadtwo(t);
th1.start();
th2.start();
	}
}
