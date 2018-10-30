package fibonacci;

import java.util.Scanner;

public class fib {
	
	/*void input(){
	
		System.out.println("enter the value of c is: \n");
		n=s2.nextInt();
		
		for(int i=1;i<=n;i++)
		{
	a=b;
	b=c;
	c=a+b;
		}
	//	System.out.println(c+" ");
		System.out.println(a+" ");
	}
	
*/
	public static void main(String[] args) {
		int c=1,a=0,b=0,n;
		//char again='y';
		// static //double n;
			Scanner s=new Scanner(System.in);
	
		System.out.println("enter the value of c is: \n");
		n=s.nextInt();
		 System.out.print("Fibonacci Series:");
	        for(int i = 1; i <= n; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	            
	        /*   while (again=='y')
	            {
	            	
	            	System.out.println("enter the value of c is: \n");
	        		n=s.nextInt();
	        		 System.out.print("Fibonacci Series:");
	        	        for(int i1 = 1; i1 <= n; i1++)
	        	        {
	        	            a = b;
	        	            b = c;
	        	            c = a + b;
	        	            System.out.print(a+" ");
	        	        Scanner in = null;
				   System.out.print("would u like to do it again? y/n ");
	            again =in.nextLine().charAt(0);	
	            } */
		// TODO Auto-generated method stub
//fib b=new fib();
//b.input();
	            }
	}



