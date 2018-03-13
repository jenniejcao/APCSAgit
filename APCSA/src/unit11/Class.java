package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Collections.*;
public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String classname, int stuCount)
	{
		name=classname;
		studentList=new Student[stuCount];
	
	}
	public Student[] giveStudents(){
		return studentList;
	}
	public static Student[] sort(Class x){
		Arrays.sort(x.giveStudents());
		return x.giveStudents();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum]=s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i=0; i<studentList.length; i++){
			classAverage+=getStudentAverage(i);
		}
		classAverage=classAverage/studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
		
	}

	public double getStudentAverage(String stuName)
	{
		for (int i=0; i<studentList.length; i++){
			if (studentList[i].getName().equals(stuName)){
				return getStudentAverage(i);
			}
		}

		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		/*
		for (int i=0; i<studentList.length; i++){
			if (getStudentAverage(i)>high){
				high=getStudentAverage(i);
				hName=getStudentName(i);
			}
		} */
		Arrays.sort(giveStudents());
		hName=studentList[studentList.length-1].getName();
		
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String lName ="";	
		/*
		for (int i=0; i<studentList.length; i++){
			if (getStudentAverage(i)<low){
				low=getStudentAverage(i);
				lName=getStudentName(i);
			}
		} */
		Arrays.sort(giveStudents());
		lName=studentList[0].getName();


		return lName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i=0; i<studentList.length; i++){
			if (getStudentAverage(i)<failingGrade){
				output+=studentList[i].getName()+" ";
			}
			
		}


		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i=0; i<studentList.length; i++){
			output+=studentList[i].toString()+"\t"+String.format("%.2f", studentList[i].getAverage())+"\n";
		}
		return output;
	}  	
}