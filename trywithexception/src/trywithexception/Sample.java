package trywithexception;
import java.io.FileOutputStream;

public class Sample 
{
  
 void get1()
 {
  	 
 try(FileOutputStream fos=new FileOutputStream("D:\\share"))
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


	public static void main(String[] args) 
	{
		Sample h=new Sample();
		h.get1();

	}

}