package find;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ample
{
  
	int a;
	float f1;
	String s1;
	char c1;
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	void input()throws IOException
	{
		System.out.println("Enter the value is:\n");
		a=Integer.parseInt(obj.readLine());
		f1=Float.parseFloat(obj.readLine());
		s1=obj.readLine();
		c1=obj.readLine().charAt(0);
	}
	void display()
	{
		System.out.println("Integer value is:\n"+a);
		System.out.println("Float value is:\n"+f1);
		System.out.println("String value  is:\n"+s1);
		System.out.println("Charater  is:\n"+c1);
	}
 	
}
class Demo
{
	public static void main(String[] args)throws IOException
	{
	
       ample g=new ample();
       g.input();
       g.display();
	}

}