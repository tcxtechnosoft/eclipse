package elseifladder;
import java.util.Scanner;
import java.util.*;
public class customer {
	int p1,p2,p3,k;
	char cn;
	Scanner s1=new Scanner (System.in);
	void get1()
	{
		System.out.println("enter the name: ");
		cn=(char) s1.nextInt();
		System.out.println("enter the product1 price: ");
		p1=s1.nextInt();
		System.out.println("enter the product2 price: ");
		p2=s1.nextInt();
		System.out.println("enter the product3 price: ");
		p3=s1.nextInt();
	}
    void get2() {
   // int k;
    k=(p1+p2+p3);
    	if(k==2000)
    {
    		
   	System.out.println("u have 10% disount on ur purchase: ");
    }
    }
    
	public static void main(String[] args) 
	{
		customer c=new customer();
		c.get1();
		c.get2();
		// TODO Auto-generated method stub

	}

}
