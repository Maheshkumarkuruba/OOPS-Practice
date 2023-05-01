package interface1.interface1.java;
class Display{
	public void display() {		
	System.out.println("display");
	}
}
interface Run{
//								By Default the variables are Static or Final in interface
	int a=5;    
	public void test();
}
interface Run1{
	public void count();
}
class Check extends Display implements Run,Run1{
	public void test() {
		System.out.println("test after override");
	}
	public void count() {
		System.out.println("count after override");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Check c1=new Check();
c1.test();
c1.count();
c1.display();
System.out.println(Check.a);
	}

}
