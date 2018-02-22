package unit8;
import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);


	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);


	}

	public void setNumber(Integer num)
	{

		number=num;



	}

	public void setRoman(String rom)
	{
		roman=rom;

	}

	public Integer getNumber()
	{
		int sum = 0;
		for(int i = 0; i < roman.length()-1; i++){
			String temp = roman.substring(i, i+1);
			String temp2 = roman.substring(i+1, i+2);
			for(int j = 0; j < LETTERS.length; j++){
				if(temp.equals(LETTERS[j])){
					for(int k = 0; k < LETTERS.length; k++){
						if(temp2.equals(LETTERS[k])){
							if(NUMBERS[j] < NUMBERS[k]){
								sum -= NUMBERS[j];
							}
							else{
								sum += NUMBERS[j];
							}
						}
					}
				}
			}
			
		}
		for(int i = 0; i < LETTERS.length; i++){
			if(roman.substring(roman.length()-1, roman.length()).equals(LETTERS[i])){
				sum += NUMBERS[i];
			}
		}
		
		return sum;
	}

	
	
	
	

	public String toString()
	{
		int i=0;
		String output="";
		while (number>0){
			while (NUMBERS[i]>number ){
				i++;
			}
			number=number-NUMBERS[i];
			output=output+LETTERS[i];
		}
		return output + "\n";
	}
}