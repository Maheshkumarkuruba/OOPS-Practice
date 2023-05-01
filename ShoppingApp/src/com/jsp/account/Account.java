package com.jsp.account;

public class Account {
	String accountholdername;
	Long accountnumber;
private	double bankbal;
	 String branch;
	 String ifsc;
	String bankname;
	public Account(String accountholdername,long accountnumber,String ifsc,String bankname) {
		this.accountholdername=accountholdername;
		this.accountnumber=accountnumber;
		this.ifsc=ifsc;
		this.bankname=bankname;
	}
	public double getBal() {
		return bankbal;
	}
	public void setBal(double bankbal) {
		this.bankbal=bankbal;
	}
	public void deposit(double amt) {
		bankbal=bankbal+amt;
		System.out.println("bankbal after deposit"+bankbal);
	}
	public void withdraw(double amt) {
		if(bankbal>amt) {
			bankbal=bankbal-amt;
			System.out.println("amount after withdraw"+bankbal);
		}
		else {
			System.out.println("invalid amount");
		}
		
	}
	public void checkbal() {
		System.out.println("remaing bal"+bankbal);
	}

}
