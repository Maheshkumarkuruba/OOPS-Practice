package com.jsp.collectionexamples;
import java.util.*;
class Library implements Comparable<Library>{
	private String bookname;
	private String authorname;
	private String bookid;
	private String returning;
	public Library(String bookname,String authorname,String bookid,String returning) {
		this.bookname=bookname;
		this.authorname=authorname;
		this.bookid=bookid;
		this.returning=returning;
	}
	
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getReturning() {
		return returning;
	}

	public void setReturning(String returning) {
		this.returning = returning;
	}

	@Override
	public String toString() {
		return "Library [bookname=" + bookname + ", authorname=" + authorname + ", bookid=" + bookid + ", returning="
				+ returning + "]";
	}
	public int compareTo(Library o1) {
		return this.getBookid().compareTo(o1.getBookid());
	}
}
public class HashsetLibrary {
	public static void addemp() {
		Library li1=new Library("biography","mahesh","124s1","2days");
		Library li2=new Library("biography","mahesh","124s3","2days");
		Library li3=new Library("biography","mahesh","124s2","2days");
		Library li4=new Library("biography","mahesh","124s4","2days");
		HashSet<Library> hlist=new HashSet<Library>();
		hlist.add(li4);
		hlist.add(li3);
		hlist.add(li2);
		hlist.add(li1);
//		//System.out.println(hlist);
//		for(Library val:hlist) {
//			System.out.println(val);
//		}
		ArrayList<Library> alist= new ArrayList<Library>(hlist);
		Collections.sort(alist);
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addemp();
	}

}
