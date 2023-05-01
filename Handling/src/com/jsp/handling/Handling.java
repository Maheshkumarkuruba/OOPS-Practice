package com.jsp.handling;

public class Handling {
	public static void check(int a) {
		try {
		int b=100/a;
		System.out.println(b);
		}
		catch(Exception a1) {
		System.out.println("invalid number");	
		check(1);
		}
		finally {
			try {
				int ar[]= {1,2,3};
				System.out.println(ar[a]);
			}
			catch(Exception ar) {
				System.out.println("invalid index");
			}
			System.out.println("finally");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check(0);
		check(2);
	}
}
