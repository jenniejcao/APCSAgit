package unit11_arraylist;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);

	}
	
	public void setName(String name)
	{
		myName=name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);

	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (getSum()-getLowGrade())/(getNumGrades()-1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return  myGrades.getLowGrade();	
	}
	public int compareTo(Object s){
		Student temp=(Student)s;
		if(this.getAverage()-temp.getAverage()>0)
			return (int)Math.ceil(this.getAverage()-temp.getAverage());
		if(this.getAverage()-temp.getAverage()<0)
			return (int)Math.floor(this.getAverage()-temp.getAverage());
		return 0;

	}
	public boolean equals(Object s){
		Student temp=(Student) s;
		if(this.getAverage()==temp.getAverage()){
			return true;
		}
		return false;
	}
	public String toString()
	{
		return getName()+" = "+myGrades.toString();
	}	
}