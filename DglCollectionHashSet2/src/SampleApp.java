import java.util.HashSet;
import java.util.Iterator;

public class SampleApp 
{
	
   HashSet j1=new HashSet();	
   void get1()
   {
	   j1.add("a1");
	   j1.add("a2");
	   j1.add("a3");
	   
	   Iterator g1=j1.iterator();
	   
	   while(g1.hasNext())
	   {
		   System.out.println("Your data is:\n"+g1.next());
		  
	   }
	   System.out.println("Your data size is:\n"+j1.size());
	   
	   System.out.println("Remove data is:\n"+j1.remove("a1"));
	   
	   System.out.println("After remove data size is:\n"+j1.size());
	   
	   System.out.println("Searching a data is:\n"+j1.contains("a1"));
	   
	   System.out.println("Searching a data is:\n"+j1.contains("a2"));
	   
	   System.out.println("Class a data is:\n"+j1.getClass());
	   
	  
   }
}

class Foo
{
	public static void main(String[] args)
	{
		
		SampleApp  k1=new SampleApp();
		k1.get1();

	}

}
