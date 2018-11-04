import java.util.Comparator;
import java.util.*;
public class MainStudentSort  
{
	
	public MainStudentSort(int studId, String studName, int age) {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String arg[])
	{
		ArrayList<Student> listStudents=new ArrayList<Student>();
		
		listStudents.add(new Student(1004,"Suresh",18));
		listStudents.add(new Student(1001,"Arun",12));
		listStudents.add(new Student(1002,"Kiran",14));
		listStudents.add(new Student(1003,"dooooos",19));
		
		Collections.sort(listStudents,new SortNameWise());
		
		for(Student student:listStudents)
		{
			System.out.print("ID:"+student.getStudId());
			System.out.print("Name:"+student.getStudName());
			System.out.println("Age:"+student.getAge());
		}
	}
	
}

