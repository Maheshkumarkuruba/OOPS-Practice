package com.jsp.handling;


/*IN CUSTOMIZE EXCEPTION ALL CHECKED EXCEPTION ARE  ACT CHEKED EXCEPTION
IN CUSTOMIZE EXCEPTION ALL UNCHECKED EXCEPTION ARE  ACT UNCHEKED EXCEPTION WHICH ARE UNDER THE RUNTIMEEXCEPTION
IN EXCEPTION SUPER CLASS ACT AS CHEKED EXCEPTION*/

class Mahesh extends Exception{
	public Mahesh(String msg) {
		super(msg);
	}
	public void checked() throws Mahesh{
		throw new Mahesh("wasted");
	}
}
public class MaheshException {
	public static void main(String[] args) {
		Mahesh m=new Mahesh("kumar");
		try {
		m.checked();
		}
		catch(Mahesh b){
//		b.printStackTrace();
			System.out.println("invalid");
		}
		// TODO Auto-generated method stub
	}
}
