/*
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

/*
import java.util.Comparator;
import java.util.*;
public class Student 

{
	int studId;
	String studName;
	int age;
	
	public Student(int studId,String studName,int age)
	{
		this.studId=studId;
		this.studName=studName;
		this.age=age;
	}
	
	public int getStudId() {
		return studId;
	}
	public String getStudName() {
		return studName;
	}
	public int getAge() {
		return age;
	}	
}
*/



public class SortNameWise implements Comparator<Student> extends Student
{
	

	@Override
	public int compare(Student arg0, Student arg1) 
	{
		return arg0.studName.compareTo(arg1.studName);
	}

}

public class MainStudentSort  extends Student
{
	//public MainStudentSort(int studId, String studName, int age) {
		super(studId, studName, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String arg[])
	{
		ArrayList<Student> listStudents=new ArrayList<Student>();
		
		listStudents.add(new Student(1001,"Suresh",18));
		listStudents.add(new Student(1004,"Arun",12));
		listStudents.add(new Student(1002,"Kiran",14));
		listStudents.add(new Student(1003,"Daniel",16));
		
		Collections.sort(listStudents,new SortNameWise());
		
		for(Student student:listStudents)
		{
			System.out.print("ID:"+student.getStudId());
			System.out.print("Name:"+student.getStudName());
			System.out.println("Age:"+student.getAge());
		}
		
	}
}