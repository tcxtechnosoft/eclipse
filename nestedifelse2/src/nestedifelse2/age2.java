/*package nestedifelse2;

public class age2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
package nestedifelse2;
import java.util.Scanner;
public class age2 {
	int s,f,d;
	Scanner s1=new Scanner (System.in);
	void get1()
	{
		System.out.println("enter the age: ");
		s=s1.nextInt();
	
		if(s>=60)
		{
		System.out.println("enter the salary:  ");
		f=s1.nextInt();
	    }
	else
		{
			System.out.println("noo "+s);
		}
	//void get2()
	//{
		//int d;
		if(f>=20000)
		{
		//System.out.println("incentive is added"+1000);
		//f=s1.nextInt();
		d=f+1000;
		System.out.println(""+d);
	    }
	else
	{
		d=f+500;
		System.out.println("incentive is added"+d);
	}
	}
	public static void main(String[] args)
	{
		age2 q=new age2();
		q.get1();
		//q.get2();
		// TODO Auto-generated method stub

	}

}

