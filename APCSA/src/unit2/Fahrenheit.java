//lab02g
package unit2;
public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit=fahren;
	}

	public double getCelsius()
	{
		double celsius=(fahrenheit-32)*(5.0/9);
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.println(String.format("%.2f", getCelsius()));
	}
	public static void main(String[] args){
		Fahrenheit test = new Fahrenheit();
		test.setFahrenheit(98.6);
		test.print();
	}
}