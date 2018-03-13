package unit11_arraylist;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Classes {
	private String teacher;
	private ArrayList<Class> classes;
	public Classes()
	{
		teacher="";
		classes=new ArrayList<Class>();
	}
	
	public Classes(String name, int number)
	{
		teacher=name;
		classes=new ArrayList<Class>(number);
	
	}
	public void addClass(String classname, int stuCount)
	{
		Class test = new Class(classname, stuCount);
		classes.add(test);

	}
	
	public String getClassName()
	{
	   return teacher;	
	}
	public double getClassesAverage()
	{
		double classesAverage=0.0;
		for (int i=0; i<classes.size(); i++){
			classesAverage+=classes.get(i).getClassAverage();
		}
		classesAverage=classesAverage/classes.size();

		return classesAverage;
	}

}
