package journals;

public class Numbers {
	public static boolean isSilly(int value){
		int sum=0;
		int num= value;
		while (num>0){
			if (value%(num%10)==0 && (num%10)!=0){
				sum += num%10;
			}
			num = (num-(num%10))/10;
		}
		if (sum%2 ==0 && sum>0){
			return true;
		}
		else {
			return false;
		}
	}
	public static int[] getSomeSillyNumbers(int count){
		int counter=1;
		int num=1;
		int [] output= new int[count];
		while (counter <= count){
			if (isSilly(num)){
				output[counter-1]=num;
				counter++;
			}
			num++;
		}
		return output;
	}
	public static void main(String[] args){
		Numbers test = new Numbers();
		System.out.println(test.isSilly(1));
		int [] output = test.getSomeSillyNumbers(5);
		int count=0;
		for (int i:output){
			System.out.println(output[count]);
			count++;
		}
	}

}
