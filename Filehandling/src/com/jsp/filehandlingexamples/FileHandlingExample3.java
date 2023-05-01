package com.jsp.filehandlingexamples;
import java.io.*;
import java.util.*;

public class FileHandlingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("c:/ java2.pdf");
try {
	System.out.println(f.createNewFile());	
}
catch(IOException e) {
e.printStackTrace();	
}

	}

}
