package armstrong;

import java.util.Scanner;

public class whi {
		int s,n,rem=0,temp;
		Scanner k2=new Scanner (System.in);
		
		void input() {
		{
			System.out.println("enter the value of n:\n ");
			n=k2.nextInt();
		}
		//void cal() {
		temp=n;
		while(n>0)
		{
			rem=n%10;
			s=s+rem*rem*rem;
			n=n/10;
		}
			if(s==temp)
			{
				System.out.println("it is armstrong:\n "+s);
			}
			else
			{
				System.out.println("it is not a armstrong:\n "+s);
			}
		}
		//System.out.println("the armstrong value is: /n" + s);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
whi w=new whi();
w.input();
	}

}
