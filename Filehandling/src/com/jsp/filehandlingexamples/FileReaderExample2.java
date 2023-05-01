package com.jsp.filehandlingexamples;
import java.io.*;
public class FileReaderExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
File f=new File("sql.doc");
FileWriter fw=new FileWriter(f);
fw.write("ABCD");
fw.flush();
fw.close();
	System.out.println("data was stored");	
	}

}
