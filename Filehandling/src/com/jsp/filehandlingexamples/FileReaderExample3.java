package com.jsp.filehandlingexamples;
import java.io.*;
public class FileReaderExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("sql.doc");
try {
FileReader fr=new FileReader(f);
 System.out.println((char)fr.read());
 System.out.println((char)fr.read());
}
catch(Exception e) {
	e.printStackTrace();
}
	}
}
