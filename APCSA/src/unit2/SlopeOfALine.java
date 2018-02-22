//lab02f
package unit2;
public class SlopeOfALine
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public SlopeOfALine(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;

	}


	public void calculateSlope( )
	{
		slope=(yTwo-yOne)/(xTwo-xOne);


	}

	public void print( )
	{
		System.out.println("The slope is " +String.format("%.2f", slope));

	}
	public static void main(String[] args){
		SlopeOfALine line1= new SlopeOfALine(5,7,6,13);
		line1.calculateSlope();
		line1.print();
	}
}