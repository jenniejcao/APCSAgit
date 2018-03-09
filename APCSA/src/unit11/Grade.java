package unit11;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;


public class Grade {
	private double value=0;
	public Grade(){
		getNumericGrade();
		getLetterGrade();
		
	}
	public Grade(double num){
		setNumericGrade(num);
		getNumericGrade();
		getLetterGrade();
	}
	public void setNumericGrade(double num){
		value=num;
	}
	
	
	public double getNumericGrade(){
		return value;
	}
	public String getLetterGrade(){
		String output="";
		if (value>=90){
			output="A";
		}
		else if (value>=80){
			output="B";
		}
		else if (value>=70){
			output="C";
		}
		else if (value>=60){
			output="D";
		}
		else{
			output="F";
		}
		return output;
		
	}
	public String toString(){
		return getNumericGrade()+"\n"+getLetterGrade();
	}

}
