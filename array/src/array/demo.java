package array;

import java.util.Scanner;

public class demo 
{
	int product[][]=new int[20][20];
	int i,j,n,m;
	Scanner g=new Scanner(System.in);
	 void get1()
	 {
		 try
		 {
		 System.out.println("Enter the n value is:\n");
		 n=g.nextInt();
		 m=g.nextInt();
		 
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
			
			 System.out.println("Enter the array value is:\n");
			 product[i][j]=g.nextInt();
			 }
			
			 
		 }
		 }
		 catch(ArrayIndexOutOfBoundsException t)
		 {
			 System.out.println("Array is big");
		 }
	 }
	 void disp()
	 {
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
			 System.out.println("Value is:\n"+product[i][j]);
			 }
		 }
	 }
}
class Demo1
{
	public static void main(String[] args)
	{
	
        demo t=new demo();
        t.get1();
        t.disp();
	}

}