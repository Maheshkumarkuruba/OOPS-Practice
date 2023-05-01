package com.jsp.filehandlingexamples;
import java.util.*;
import java.io.*;
public class FileHandlingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("java.txt");
		try {
			System.out.println(f1.createNewFile());	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
          long milsec=f1.lastModified();
          Date d=new Date(milsec);
          System.out.println(d);
	}

}
