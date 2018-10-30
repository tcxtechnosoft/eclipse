package reverse;

import java.util.Scanner;

public class loo {
	int k,reverse=0;
	Scanner s1=new Scanner(System.in);

	void input()
	{
	{
		System.out.println("enter the value of n");
		k=s1.nextInt();
	
	}
	while(k !=0)
		{
		reverse=reverse*10;
		reverse=reverse+ k%10;
		k=k/10;
		}
	System.out.println("reverse no is"+reverse);
		          }
			

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
loo m=new loo();
m.input();
	
	}
                  }
