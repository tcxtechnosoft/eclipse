import java.util.HashSet;

public class Sample 
{
	
   HashSet list=new HashSet();	
   void get1()
   {
	   list.add("mohan");
	   list.add("azar");
	   list.add("niit");
	   
	   System.out.println("Your list data is:\n"+list);
	   System.out.println("size a data is:\n"+list.size());
   }
}
class Demo
{
	public static void main(String[] args) 
	{
		
		Sample g1=new Sample();
		g1.get1();

	}

}
