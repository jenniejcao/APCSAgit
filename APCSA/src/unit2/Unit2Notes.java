package unit2;

public class Unit2Notes {
	static float fNum = 4.555564f;
	static String output = "";
	static int number = 0;
	
	public static void main(String[] args){
		output += "Formatted Number ";
		output+=String.format("%.2f", fNum);
		System.out.println(output);
		
		number=(int)fNum;
		System.out.println(number);
	}
}
