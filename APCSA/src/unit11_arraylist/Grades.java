package unit11_arraylist;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades
{
	private ArrayList<Grade> gradeList ;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String values)
	{
		Scanner keyboard = new Scanner(values);
		int num = keyboard.nextInt();
		gradeList = new ArrayList<Grade>(num);
		int i =0;
		while (i<num){
			if (keyboard.hasNextDouble()){
				Grade test = new Grade(keyboard.nextDouble());
				gradeList.add(test);
			}
			else{
				keyboard.next();
				i=i-1;
			}
			i++;
		}
		
	}
	
	public void setGrade(int spot, double grade)
	{
		gradeList.set(spot, new Grade(grade));

	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i=0; i<gradeList.size(); i++){
			sum=sum+(gradeList.get(i)).getNumericGrade();	
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i=0; i<gradeList.size(); i++){
			if (low>gradeList.get(i).getNumericGrade()){
				low=gradeList.get(i).getNumericGrade();
			}
		}

		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i=0; i<gradeList.size(); i++){
			if (high<gradeList.get(i).getNumericGrade()){
				high=gradeList.get(i).getNumericGrade();
			}
		}


		return high;
	}
	
	public int getNumGrades()
	{
		return gradeList.size();
	}
	
	public String toString()
	{
		String output="";
		for (int i=0; i<gradeList.size(); i++){
			output=output+gradeList.get(i).getNumericGrade()+" ";
		}

		return output;
	}	
}