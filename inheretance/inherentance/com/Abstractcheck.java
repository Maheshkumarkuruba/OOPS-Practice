package inheretance.inherentance.com;
abstract class Sample1{
	 public Sample1() {
		System.out.println("sample");
	}
//	public abstract void fun();
}
class Menu extends Sample1{
//	public void fun() {
//		System.out.println("mawj");
//	}
	public Menu() {
		super();
	}
}

public class Abstractcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Sample1 s=new Sample1();
		Menu m1=new Menu();

	}

}
