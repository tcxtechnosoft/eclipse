import java.util.Scanner;
public class scanner {
int a,b,c,d,e,f;
Scanner s =new Scanner (System.in);
void input()
{
	System.out.println("enter the a and b value : \n");
	a =s.nextInt();
	b =s.nextInt();
	c =a+b;
	d=a-b;
	e=a*b;
	f=a/b;
	 System.out.println("your answer " +c);
	 System.out.println("your answer " +d);
	 System.out.println("your answer " +e);
	 System.out.println("your answer " +f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner t=new scanner();
		t.input();

	}

}
