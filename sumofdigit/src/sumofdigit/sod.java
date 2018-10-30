package sumofdigit;
import java.io.*;
import java.util.Scanner;

public class sod 
//static int getSum(int n)
{
int t;//sum=0;
Scanner s2=new Scanner(System.in);
	void input() {
	{
		System.out.println("enter the value of t: \n");
		t=s2.nextInt();
	}
	int sum=0;
	while(t!=0)
	{
		sum=sum+t%10;
		t=t/10;
	}
	//return sum;
	System.out.println("sum of digit is: \n"+sum);
}

	public static void main(String[] args) {
		//int t=687;
		// TODO Auto-generated method stub
		//System.out.println(getSum(t));
 sod n=new sod();
n.input();
	}
}


