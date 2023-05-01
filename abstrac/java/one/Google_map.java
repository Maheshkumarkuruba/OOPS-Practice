package abstrac.java.one;
interface Map{
	public void daymap();
	public void nightmap();
}
class Map_2d implements Map{
public void daymap() {
	System.out.println("daymap in 2d");
}
public void nightmap() {
	System.out.println("nightmap in 2d");
}
}
class Map_3d implements Map{
	public void daymap() {
		System.out.println("daymap in 3d");	
	}
	public void nightmap() {
		System.out.println("nightmap in 3d");
	}
}
class Service{
	public Map Service(Map m) {
		if(m instanceof Map_2d) {
	Map_2d m1=new Map_2d();
	m1.daymap();
	m1.nightmap();
		}
		else {
	Map_3d m2=new Map_3d();
	m2.daymap();
	m2.nightmap();
		}
	return m;
	}
	
}
public class Google_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Service s=new Service();
Map_2d m1=new Map_2d();
Map_3d m2=new Map_3d();
    Map n=s.Service(m2);
//s.Service(m1);
System.out.println(n);


	}
}
