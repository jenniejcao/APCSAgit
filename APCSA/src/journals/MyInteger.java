package journals;
import java.lang.Math;
public class MyInteger {
	int x=0;
	/*(The MyInteger class) Design a class named MyInteger. The class contains: 
		An int data field named value that stores the int value represented by this object. 
		A constructor that creates a MyInteger object for the specified int value. 
		A getter method that returns the int value.
		The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is even, odd, or prime, respectively. 
		The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively. 
		The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively. 
		The methods equals(int) and equals(MyInteger) that return true if the value in this object is equal to the specified value. 
		A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
		A static method parseInt(String) that converts a string into an int value.
*/
	public MyInteger(int y){
		x=y;
	}
	public int getInt(){
		return x;
	}
	public boolean isEven(){
		if (x%2==0){
			return true;
		}
		return false;
	}
	public boolean isOdd(){
		if (x%2==1){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		for (int i=2; i<= Math.sqrt(x); i++){
			if (x%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int y){
		if (y%2==0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(int y){
		if (y%2==1){
			return true;
		}
		return false;
	}
	public static boolean isPrime(int y){
		for (int i=2; i<= Math.sqrt(y); i++){
			if (y%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger y){
		
		if (y.getInt()%2==0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger y){
		if (y.getInt()%2==1){
			return true;
		}
		return false;
		
	}
	public static boolean isPrime(MyInteger y){
		for (int i=2; i<= Math.sqrt(y.getInt()); i++){
			if (y.getInt()%i==0){
				return false;
			}
		}
		return true;
	}
	public boolean equals(int y){
		if (x==y){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger y){
		if (x==y.getInt()){
			return true;
		}
		return false;
	}
	public static int parseInt(char[] arrayint){
		int result = 0;
		for (int i=arrayint.length-1; i>=0; i--){
			result=(int) (result+(arrayint[i]*Math.pow(10, arrayint.length-i-1)));
		}
		return result;
	}
	public static int parseString(String input){
		char[]nums = input.toCharArray();
		return parseInt(nums);
		
	}
	public static void main(String[] args){
		MyInteger test = new MyInteger(5);
		System.out.println(test.isPrime());
		System.out.println(MyInteger.isPrime(5));
		System.out.print(test.equals(5));
		char[] go = {1,2,3,4,5,9,0};
		System.out.println("\n"+MyInteger.parseInt(go));
		System.out.println(MyInteger.isEven(4));
		
		
	}
	

}
