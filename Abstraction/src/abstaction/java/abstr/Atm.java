package abstaction.java.abstr;

public class Atm extends Account implements User {
	@Override
	public void transaction(double amt,int pin) {
		// TODO Auto-generated method stub
		if(pin==1) {
			deposit(amt);
		}
		else {
			withdraw(amt);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
