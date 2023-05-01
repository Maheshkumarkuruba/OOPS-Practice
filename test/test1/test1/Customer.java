package test.test1.test1;

public class Customer {
	String name="mahesh";
	int id=125311;
	 String product="mobile";
	public void displaydetails() {
		System.out.println(name);
		System.out.println(id);
	}
	 public void product() {
		 if(product=="mobile") {
		 System.out.println("received product");
		 }
		 else {
			 System.out.println("not received product");
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer c1=new Customer();
c1.displaydetails();
c1.product();

	}

}
