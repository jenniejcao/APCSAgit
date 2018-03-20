package journals;

public class Factorial {
	private int total=1;
	public Factorial(){
		
	}
	public int getFactorial(int x){
		if (x>1){
			total=total*x;
			x--;
			getFactorial(x);
		}
		
		return total;
		
	}
	public static void main(String[] args){
		int total=1;
		for (int i=2; i<=10; i++){
			total=total*i;
		}
		System.out.println(total);
		
		Factorial test = new Factorial();
		System.out.println(test.getFactorial(10));
	
	}

}
