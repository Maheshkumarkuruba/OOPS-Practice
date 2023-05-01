package abstaction.java.abstr;

public class Web extends Account implements User {
	@Override
	public void transaction(double amt,int choice) {
		// TODO Auto-generated method stub
		if(choice==123) {
		send(amt);
		}
		else {
			recieve(amt);
		}
	}
public void send(double amt){
	if(bal>=amt) {
		bal=bal-amt;
		System.out.println(bal +"after withdraw ");
	}
	else {
		System.out.println("invalid amount");
	}
}
public void recieve(double amt) {
	bal=bal+amt;
	System.out.println(bal);
}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
