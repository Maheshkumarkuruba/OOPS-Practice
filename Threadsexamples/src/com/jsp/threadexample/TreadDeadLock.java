package com.jsp.threadexample;
class Threadone1 extends Thread{
	String s1;
	String s2;
	public Threadone1(String s1,String s2) {
		this.s1=s1;
		this.s2=s2;
		}
	@Override
	public void run() {
		System.out.println("t1 is waiting to lock the s1");
		synchronized(s1) {
			System.out.println("t1 lock s1");
			System.out.println("t1 is waiting to lock the s2");
			try {
				System.out.println("pause the executin");
				s1.wait();
				System.out.println("resume the execution");
			}
			catch(InterruptedException ea) {
				ea.printStackTrace();
			}
			synchronized(s2) {
				System.out.println("t1 lock s2");
			}
			System.out.println("t1 unlock s1");
			System.out.println("t1 unlock s2");
		}
	}
}
class Threadtwo2 extends Thread{
	String s1;
	String s2;
	public Threadtwo2(String s1,String s2) {
		this.s1=s1;
		this.s2=s2;
		}
	@Override
	public void run() {
		System.out.println("t2 is waiting to lock the s1");
		synchronized(s2) {
			System.out.println("t2 lock s2");
			System.out.println("t2 is waiting to lock the s1");	
			synchronized(s1) {
				System.out.println("t2 lock s1");
				s1.notify();
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
		}
	}
}
public class TreadDeadLock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sr1=new String ("hello");
		String sr2=new String("hi");
		Threadone1 th1=new Threadone1(sr1,sr2);
		Threadtwo2 th2=new Threadtwo2(sr1,sr2);
		th1.start();
		th2.start();
	}

}
