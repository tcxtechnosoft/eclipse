package array;

import java.util.Scanner;

public class onearray
{
	int n,i;
	int productid[]=new int[10];
	Scanner g=new Scanner(System.in);
	void f1()
	{
		System.out.println("Enter the value is:\n");
		n=g.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is:\n");
			productid[i]=g.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("Result is:\n"+productid[i]);
		}
	}
}
class Demo3
{
	public static void main(String[] args)
	{
	   onearray h=new onearray();
	   h.f1();
	   

	}

}