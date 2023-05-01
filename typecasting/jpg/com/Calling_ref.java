package typecasting.jpg.com;
class User1{
	
}
class Customer1 extends User1{
	public User1 login(User1 u) {
		return u;
	}
}
class Admin1 extends User1{
	
}
public class Calling_ref extends User1{
//	public int test() {
//		int a=52;
//		return a ;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calling_ref c1= new Calling_ref();
//		System.out.println(c.test());
		Login l1= new Login();
		Admin1 a1=new Admin1();
		User1 u1=new User1();
		Customer1 c =new Customer1();
		System.out.println(c);
//	     System.out.println(c.login(u1));
////	     System.out.println(c1.login(a1));
//	     System.out.println(c.login(c));
		User1 u= c.login(c);
		System.out.println(u);
		System.out.println(c.login(u));

	}

}
