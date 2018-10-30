package cust;

import java.util.Scanner;
//import java.util.math 	;
public class product {
	int p1,p2,p3;
	String cn;
	double percentage1,percentage;
	Scanner s1=new Scanner (System.in);
	void get1()
	{
		System.out.println("enter the name: ");
		cn=s1.next();
		System.out.println("enter the product1 price: ");
		p1=s1.nextInt();
		System.out.println("enter the product2 price: ");
		p2=s1.nextInt();
		System.out.println("enter the product3 price: ");
		p3=s1.nextInt();
	}
	
   void get2() {
    int k;
    k=(p1+p2+p3);
    percentage = (k*0.1);
    percentage1 = (k*0.05);
    	if(k>=2000)
    {
    		
   	System.out.println("u have 10% disount on ur purchase: "+k);
   	System.out.println("ur percentage: "+percentage);
    }
    	else
    	{
    		System.out.println("u have no 10% disount on ur purchase: "+k);
    	}
    	
    	if(k>=1000)
        {
        		
       	System.out.println("u have 5% disount on ur purchase: "+k);
       	System.out.println("ur percentage: "+percentage1);
        }
        	else
        	{
        		System.out.println("u have no disount on ur purchase: "+k);
        	}

    	
    }
    
	public static void main(String[] args) 
	{
		product c=new product();
		c.get1();
		c.get2();
		// TODO Auto-generated method stub

	}

}
