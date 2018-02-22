package unit2;
import java.util.Scanner;
public class ReviewAssignment2 {
	private double acceleration;
	private double velocity;
	public void getVariables(){
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Enter plane's acceleration: ");
		acceleration = keyboard.nextDouble();
		System.out.print("Enter plane's velocity: "  );
		velocity = keyboard.nextDouble();
	}
	public void calculate()
	{
		double length = Math.pow(velocity, 2)/(2*acceleration);
		System.out.println("The minimum runway length for this airplane is "+String.format("%.3f", length));
	}

	public static void main(String[] args) {
		ReviewAssignment2 test = new ReviewAssignment2();
		test.getVariables();
		test.calculate();
		
				
		

	}

}


//reviewassignment2 bankaccount.java
/** package unit2;

public class BankAccount
{
  private double balance;
  private double interest;

 
  public BankAccount()
  {
      balance = 0;
      interest=0;
  }


  public BankAccount(double initialBalance, double interestrate)
  {
      balance = initialBalance;
      interest=interestrate;
  }

 
  public void addInterest(){
  	balance= interest*balance+balance;
  	
  }
  public void deposit(double amount)
  {
      balance = balance + amount;
  }

  
  public void withdraw(double amount)
  {
      balance = balance - amount;
  }

 
  public double getBalance()
  {
      return balance;
  }
}
**/
