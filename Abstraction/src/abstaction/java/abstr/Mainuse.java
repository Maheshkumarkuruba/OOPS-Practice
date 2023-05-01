package abstaction.java.abstr;

public class Mainuse{

public static void main(String[] args){
		// TODO Auto-generated method stub
		/*
		 * Servic s=new Servic(); Atm a= new Atm(); User u1=s.service(a);
		 * u1.transaction(); Account a3=s.facility(a); a3.deposit(1000.0);
		 * a3.withdraw(2000.0); System.out.println("========================"); Web
		 * w1=new Web(); User u2=s.service(w1); u2.transaction();
		 */
//Account a1=new Account(1000.0);
	System.out.println("==========atm==========");
	Servic s=new Servic();
	User u=s.service(1);
	u.transaction(1000.0, 1);
	u.transaction(500,2);
	System.out.println("==========web=======");
	Web w=new Web(); 
	User u1=s.service(2);
	u1.transaction(1000.0, 124);
	u1.transaction(100,123);
	System.out.println("==========account======");
	Account a1=new Account(0.0);
	a1.deposit(1000.0);
	a1.withdraw(500.0);

	
	}

}
