package arrayex;

import java.util.Scanner;

public class sample {
	int pid[]=new int[20];
	int i,n,k,temp;
	Scanner f=new Scanner(System.in);

	
	void input()
	{
System.out.println("enter the value of ");		
n=f.nextInt();
for (i=0;i<=n;i++)
{
System.out.println("enter the array value\n");	
pid[i]=f.nextInt();
}
//System.out.println("the index value is swapped");

	}
void display() {


//for(int j = 0; j < pid.length; j++)
{
    int start = 0,end = n-1;
    start=start+1;
    end=end-1;
    for(int j=0;j<pid.length;j++) {
    	
    	System.out.println("the index value is swapped"+start);
    }
}
//System.out.println("the index value is swapped"+pid[pid.length - i - 1]);







/*System.out.println("enetr the index value");
k=f.nextInt();

for (i=0;i<=n;i++)
{
if(i==k)
{
	System.out.println("array value is  :\n"+pid[i]);
	}
	
else
{
System.out.println("not found...");	
}
	}  
	*/
/*for(i=0;i<=n;i++)
{
	System.out.println("array value"+pid[i]);
	} */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample q=new sample();
		q.input();
		q.display();

	}

}
