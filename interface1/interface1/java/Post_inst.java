package interface1.interface1.java;
interface Post{
	public void like();
	public void share();
	public void comment();
}
interface Photo_edit{
public void add_song();	
}
interface Video_edit{
	public void mute();
	
}
class Photo implements Post, Photo_edit{
int size=14;
public void like() {
	System.out.println("like");	
}
public void share() {
System.out.println("share");	
}
public void comment() {
System.out.println("comment");	
}
public void crop() {
System.out.println("crop");	
}
public void filter() {
System.out.println("filter");	
}
public void add_song() {
System.out.println("add_song");	
}
}
class Video implements Post,Video_edit{
	int duration=5;
	public void trim() {
System.out.println("trim");	
	}
	public void like() {
System.out.println("like");		
	}
	public void share() {
	System.out.println("share");		
	}
	public void comment() {
	System.out.println("comment");	
	}	
	public void mute() {
	System.out.println("mute");		
	}	
}

public class Post_inst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Video v=new Video();
v.trim();
v.like();
v.share();
v.comment();
v.mute();
System.out.println(v.duration);
System.out.println("========================");
Photo p=new Photo();
p.add_song();
p.like();
p.share();
p.comment();
p.filter();
System.out.println(p.size);
	}

}
