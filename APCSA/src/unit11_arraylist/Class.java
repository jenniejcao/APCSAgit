package unit11_arraylist;
import java.util.Arrays;
import java.util.Scanner;

import unit11.Student;

import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
import java.util.Collections;


public class Class
{
	private String name;
	private ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String classname, int stuCount)
	{
		name=classname;
		studentList=new ArrayList<Student>(stuCount);
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(stuNum,s);

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i=0; i<studentList.size(); i++){
			classAverage+=getStudentAverage(i);
		}
		classAverage=classAverage/studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
		
	}

	public double getStudentAverage(String stuName)
	{
		for (int i=0; i<studentList.size(); i++){
			if (studentList.get(i).getName().equals(stuName)){
				return getStudentAverage(i);
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		/*
		for (int i=0; i<studentList.size(); i++){
			if (getStudentAverage(i)>high){
				high=getStudentAverage(i);
				hName=getStudentName(i);
			}
		} */
		Collections.sort(studentList);
		hName=studentList.get(studentList.size()-1).getName();
		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{ 
		double low = Double.MAX_VALUE;
		String lName ="";		
		/*
		for (int i=0; i<studentList.size(); i++){
			if (getStudentAverage(i)<low){
				low=getStudentAverage(i);
				lName=getStudentName(i);
			}
			
		}
		*/
		Collections.sort(studentList);
		lName=studentList.get(0).getName();


		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i=0; i<studentList.size(); i++){
			if (getStudentAverage(i)<failingGrade){
				output+=studentList.get(i).getName()+" ";
			}
			
		}


		return output;
	}
	
	public String toString()
	{	Collections.sort(studentList);
		String output=""+getClassName()+"\n";
		for (int i=0; i<studentList.size(); i++){
			output+=studentList.get(i).toString()+"\t"+String.format("%.2f", studentList.get(i).getAverage())+"\n";
		}
		return output;
	}  	
}