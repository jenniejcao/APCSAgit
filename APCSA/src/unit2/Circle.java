//lab02e
package unit2;
public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius=rad;
	}

	public void calculateArea( )
	{
		area=Math.PI*Math.pow(radius, 2);
	}

	public void print( )
	{
		System.out.println("The area is:: "+area);
	}


public static void main(String[] args)
{
	Circle a = new Circle();
	a.setRadius(1);
	a.calculateArea();
	a.print();
}}