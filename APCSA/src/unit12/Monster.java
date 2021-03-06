package unit12;
import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight=0;
	private int myHeight=0;
	private int myAge=0;

	//write a default Constructor
	public Monster(){
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		myHeight=ht;
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		myWeight=wt;
		myHeight=ht;
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster (int ht, int wt, int age){
		myWeight=wt;
		myHeight=ht;
		myAge=age;
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		myHeight=ht;
	}
	public void setWeight(int wt){
		myWeight=wt;
		
	}
	public void setAge(int age){
		myAge=age;
		
	}

	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		if (compareTo(obj)==0){
			return true;
		}
		


		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (rhs.getHeight()>getHeight()){
			return -1;
		}
		else if (rhs.getHeight()<getHeight()){
			return 1;
		}
		else if (rhs.getWeight()>getWeight()){
			return -1;
		}
		else if (rhs.getWeight()<getWeight()){
			return 1;
		}
		else if (rhs.getAge()>getAge()){
			return -1;
		}
		else if (rhs.getAge()<getAge()){
			return 1;
		}

		return 0;
	}

	//write a toString() method
	public String toString(){
		return getHeight()+" "+getWeight()+" "+getAge();
	}
	
	
}