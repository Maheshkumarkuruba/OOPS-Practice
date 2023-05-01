package java.encapsulation.bal;
class Account {
	private double bal;
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal=bal;
	}
}
class Customer{
	public void deposit(double amt,Account a) {
		double b=a.getBal()+amt;
		a.setBal(b);
	}
	public void withdraw(double amt,Account a){
    if(a.getBal()>amt){
        double b=a.getBal()-amt;
        a.setBal(b);
    }
    else{
        System.out.println("invalid amt");
    }
	}
    public void checkbal(Account a){
  System.out.println(a.getBal());  
}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a=new Account();
Customer c=new Customer();
c.deposit(1000.0, a);
c.checkbal(a);
	}

}
