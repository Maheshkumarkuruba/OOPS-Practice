package com.jsp.filehandlingexamples;
import java.util.*;
import java.io.*;
public class FileHandlingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				FOLDER CREATING HANDLING THE FOLDER
File f1=new File("sql1");		
File f2=new File("c:/sql2");
boolean res1=f1.mkdir();
boolean res2=f2.mkdir();
System.out.println(res1);
System.out.println(res2);
//if(f2.exists()) {
//	f2.delete();
//	System.out.println("folder was created");
//}
//else {
//	System.out.println("folder was not there");
//}
//System.out.println(f1.renameTo(f2));
	}

}
