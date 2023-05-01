package com.jsp.Has_A;

import com.jsp.Has_A.Account;
import com.jsp.Has_A.Atm;
import com.jsp.Has_A.Service;
import com.jsp.Has_A.User;
import com.jsp.Has_A.Web;

interface User {
	public void transaction(double amt,int choice,Account a);
}

class Account {
	double bal;
	public Account(double bal) {
		this.bal=bal;
	}
public void deposit(double amt) {
	bal=bal+amt;
	System.out.println(bal +"after deposit ");
}
public void withdraw(double amt) {
	if(bal>=amt) {
		bal=bal-amt;
		System.out.println(bal +"after withdraw ");
	}
	else {
		System.out.println("invalid amount");
	}
}
}
class Atm implements User{
	public void transaction( double amt,int choice,Account a) {
		if(choice==1) {
			a.deposit(amt);
		}
		else {
			a.withdraw(amt);
		}
	}
}
class Web implements User{
	Account a;
	public Web(Account a) {
		this.a=a;
	}
	public void transaction(double amt,int choice,Account a) {
		if(choice==123) {
			receive(amt);
		}
		else {
			send(amt);
		}
	}
	public void receive(double amt) {
	a.bal=a.bal+amt;
	System.out.println("recieved amount from web "+a.bal);
	}
	public void send(double amt) {
		if(a.bal>amt) {
			a.bal=a.bal-amt;
			System.out.println("send after bal "+a.bal);
		}
		else {
			System.out.println(" invalid amt entered ");
		}
	}
}
class Service{
	User u;
	Account a;
	public Service(Account a) {
		this.a=a;
	}
	public User service(int choice) {
		if(choice==1) {
		 u=new Atm();
		System.out.println(" atm object created");
		}
		else {
			 u=new Web(a);
			System.out.println(" web object is created");
		}
		return u;
	}
}

public class Has_A_Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a=new Account(0.0);
Service s=new Service(a);
User u=s.service(1);
u.transaction(1000.0,1,a);
	}

}
