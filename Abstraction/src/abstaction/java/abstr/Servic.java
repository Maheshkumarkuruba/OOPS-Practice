package abstaction.java.abstr;
import abstaction.java.abstr.Account;
public class Servic {
	User u;
	public User service(int choice) {
		if(choice ==1) {
		u=new Atm();
		System.out.println("object of Atm created");
//		a.transaction();
//		a.deposit(1000.0);
//		a.withdraw(500.0)
		return u;
		}
		else {
			u=new Web();
			System.out.println("object of web created");
//			w.transaction();
			return u;
		}
			
		}
//	public Account facility(Account a1) {
//		Account a2= new Account(0.0);
//		return a1;
//	}

}
