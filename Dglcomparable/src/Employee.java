/*public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
*/
import java.util.*;


public class Employee implements Comparable<Employee>
{
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId,String empName,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "Employee ID:"+empId+" Employee Name:"+empName+" Salary:"+salary;
	}

	@Override
	public int compareTo(Employee arg0) 
	{
		if(this.salary>arg0.salary)
			return 1;
		else if(this.salary<arg0.salary)
			return -1;
		else
			return 0;
	}
}
		class SortEmployee 
	{
		public static void main(String arg[])
		{
			TreeSet<Employee> listEmployees=new TreeSet<Employee>();
			
			listEmployees.add(new Employee(1001,"Vinod",78000));
			listEmployees.add(new Employee(1003,"Arun",58000));
			listEmployees.add(new Employee(1002,"Sunita",88000));
			listEmployees.add(new Employee(1004,"Kishore",8000));
			
			for(Employee employee:listEmployees)
			{
				System.out.println(employee);
			}
			
		}
	}
