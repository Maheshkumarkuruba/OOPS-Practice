package interface1.interface1.java;
interface Run2{
public default void test() {
	
}
}
interface Run3{
public default void test() {
	
}
}
class Count implements Run2,Run3{
	public void test() {
		System.out.println("test");
	}
}
public class Interface_same_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Count c = new Count();
c.test();
	}

}
