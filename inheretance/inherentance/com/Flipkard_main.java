package inheretance.inherentance.com;
//this is the super class for every subclass
class Flipkart{
	public void order() {
		System.out.println("order products");
	}
	
}
class Fashion extends Flipkart{
	public void men(String name) {
		if(name=="pumaformens" ||name=="pumaformen" ) {
			order();
		}
		else {
			System.out.println("invalid selection");
		}
		
	}
	public void women(String name) {
		if(name=="pumaforwomen" ||name=="pumaformens") {
			order();
		}
		else {
			System.out.println("invalid selection");
		}
	}
	
}
//this class is inheriting the propreties from flipkart..this class is the super class for brand_fashion
class Electronics extends Flipkart{
	public void mobile() {
		order();
	}
	public void laptops() {
		order();
	}
	
}

class Groceries extends Flipkart{
	
}
class Home extends Flipkart{
	
}
//this class inheriting the properties of fashion and flipkart 
class Brand_Fashion extends Fashion{
	public void pumaformen() {
		men("pumaformen");
		
	}
	public void pumaforwomens() {
		women("addidsforwomen");
	}
}
class Company_name extends Electronics{
	public void samsung(String name) {
		if(name=="mobile") {
		mobile();
		}
		else {
		laptops();
		}
	}
	public void mi(String name) {
		if(name=="mobile") {
		mobile();
		}
		else {
		laptops();
		}
	}
	public void dell() {
		laptops();	
	}
	
}

public class Flipkard_main {

	public static void main(String[] args) {
		System.out.println("=======  fashion");
		Brand_Fashion b1=new Brand_Fashion();
		b1.pumaformen();
		b1.pumaforwomens();
//		b1.men();
//		b1.women();
//		b1.order();
		System.out.println("==========  electronics");
		Company_name c1= new Company_name();
		c1.samsung("laptops");
		c1.mi("mobile");
		c1.dell();
		// TODO Auto-generated method stub

	}

}

