package com.jsp.debitcard;

import com.jsp.account.Account;

public class Debitcard {
	int pinNumber;
	 int cvv;
	String expDate;
	 Account a1;
	 public Debitcard() {
		 
	 }
	public Debitcard(int pinNumber,int cvv,String expDate,Account a1) {
		this.pinNumber=pinNumber;
		this.cvv=cvv;
		this.expDate=expDate;
		this.a1=a1;
	}
	public void generatepin() {
		
	}
	public void updatepinNumber() {
		
	}
public void  updateDtails(int cvv,String expDate) {
	
}
public void onlinepayment( double b1,double productAmt) {
	
	a1.setBal(b1);
	if(a1.getBal()>productAmt) {
		double b=a1.getBal()-productAmt;
		a1.setBal(b);
		System.out.println("payment successfull  order placed");
	}
	else {
		System.out.println("insufficient fund");
	}
}
}
