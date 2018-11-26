package trywithexception;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class viewdata 
{
  
 void get1()
 {
  	 
 try(FileOutputStream fos=new FileOutputStream("D:\\share12.pdf"))
 {
	String name="das";
	byte s[]=name.getBytes();
	fos.write(s);
	System.out.println("FileInserted!!!");
 }
 catch(Exception t)
 {
	 System.out.println(t);
 }
 
 }
 void get2() throws IOException,FileNotFoundexception;
 {
	 FileInputStream fis=new FileInputStream("D:\\p1.pdf");
	 int i;
	 while(i=fis.read()!=-1)
{
	System.out.print((char)i);
	}
 
}


	public static void main(String[] args) 
	{
		Sample h=new Sample();
		h.get1();
        h.get2();
	}

}