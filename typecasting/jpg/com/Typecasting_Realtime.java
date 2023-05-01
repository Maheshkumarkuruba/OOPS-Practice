package typecasting.jpg.com;

class User {

}

class Customer extends User {
	public void orderproduct() {
		System.out.println("ordered product from customer");
	}

	public void cancelproduct() {
		System.out.println("cancel product from customer");
	}
}

class Admin extends User {
	public void addproduct() {
		System.out.println("product is added ");
	}

	public void removeproduct() {
		System.out.println("product is removed ");
	}
}

class Login {
	public void login(User u) {
		if (u instanceof Customer) {
			Customer c = new Customer();
			c.orderproduct();
			c.cancelproduct();
		} else {
			Admin a = new Admin();
			a.addproduct();
			a.removeproduct();
		}
	}
}

public class Typecasting_Realtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l = new Login();
		Customer c1 = new Customer();
		l.login(c1);
		System.out.println("========");
		Admin a = new Admin();
		l.login(a);

	}

}
