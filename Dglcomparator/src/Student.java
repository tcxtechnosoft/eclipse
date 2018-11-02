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