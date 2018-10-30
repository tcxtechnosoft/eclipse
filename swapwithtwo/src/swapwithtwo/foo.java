package swapwithtwo;

import java.util.Scanner;

public class foo {
	int x,y;
	Scanner g=new Scanner(System.in);
	
	void input() {
		
	System.out.println("enter the value of x : \n");
	x=g.nextInt();
	System.out.println("enter the value of y : \n");
	y=g.nextInt();
	}
	void display()
	{
		 System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
foo f= new foo ();
f.input();
f.display();
	}
	}
	





/*

public class foo {
	 
    public static void main(String a[]){
        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}
*/