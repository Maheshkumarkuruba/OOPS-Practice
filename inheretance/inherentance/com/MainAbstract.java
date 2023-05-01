package inheretance.inherentance.com;
abstract class Sample{
	public abstract void function();
	public void function2() {
		System.out.println("void method");
	}
	public static void function3() {
		System.out.println("static method");
	}
}
class Demo extends Sample{
	public void function() {
		System.out.println("abstact method overided");
	}
}
public class MainAbstract {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.function();
		d.function2();
		Sample.function3();
		// TODO Auto-generated method stub

	}

}
