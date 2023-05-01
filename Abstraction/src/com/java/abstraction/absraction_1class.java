package com.java.abstraction;
interface User{
	public void transaction(double amt,int choice);
}
class Account{
	double bal;
	public Account(double bal) {
		this.bal=bal;
	}
	public Account() {
		
	}
	public void deposit(double amt) {
		bal=bal+amt;
		System.out.println("after deposit in Atm "+bal);
	}
	public void withdraw(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println("after withdraw bal "+bal);
		}
		else {
			System.out.println("invalid amount");
		}
	}
}
class Atm extends Account implements User{
	public void transaction( double amt,int choice) {
		if(choice==1) {
			deposit(amt);
		}
		else {
			withdraw(amt);
		}
	}
}
class Web extends Account implements User{
	public void transaction(double amt,int choice) {
		if(choice==123) {
			receive(amt);
		}
		else {
			send(amt);
		}
	}
	public void receive(double amt) {
	bal=bal+amt;
	System.out.println("recieved amount from web "+bal);
	}
	public void send(double amt) {
		if(bal>amt) {
			bal=bal-amt;
			System.out.println("send after bal "+bal);
		}
		else {
			System.out.println(" invalid amt entered ");
		}
	}
}
class Service{
	User u;
	public User service(int choice) {
		if(choice==1) {
		 u=new Atm();
		System.out.println(" atm object created");
		}
		else {
			 u=new Web();
			System.out.println(" web object is created");
		}
		return u;
	}
}
public class absraction_1class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Service s=new Service();
//Atm a=new Atm();
User u=s.service(1);
u.transaction(1000.0,1);
u.transaction(500.0,0);
	}

}
