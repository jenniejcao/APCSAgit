package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Student2 implements Comparable<Student2>
{
	private String myName;
	private Grades myGrades;
	
	public Student2()
	{
		setName("");
		setGrades("");
	}
	
	public Student2(String name, String gradeList)
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
	public Grade[] giveGrades(){
		return myGrades.giveGrades();
		}
	
	public int compareTo(Student2 d){
		if (getAverage()-d.getAverage()>0) return 1;
		else if(getAverage()-d.getAverage()==0) return 0;
		return -1;
	}
	public boolean equals(Student2 s){
		Student2 temp=(Student2) s;
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