package cn.cssf.chapter8;

import java.io.*;
public class FileCopy {
  public static void main(String[] args) {
	  int b = 0;
	  FileReader in = null;
	  FileWriter out = null;
	  try {
	    in = new FileReader("d:/share/java/HelloWorld.java");
	    out = new FileWriter("d:/share/java/io/HW.java");
	    while((b=in.read())!=-1){
	      out.write(b);
	    }
	    out.close();
	    in.close(); 
	    
	  } catch (FileNotFoundException e2) {
	    System.out.println("file no found"); System.exit(-1);
	  } catch (IOException e1) {
	    System.out.println(""); System.exit(-1);
	  }
	  System.out.println("");
  }
}
