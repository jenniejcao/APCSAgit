package unit1;
import java.awt.Color;
import java.awt.Graphics;

public class CreateYourOwnShape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public CreateYourOwnShape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width=wid;
		height=ht;
		color=col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(xPos, yPos, width, height);
      window.setColor(color.BLUE);
      window.fillRect(xPos, yPos, width/2, height/2);
      window.setColor(color.RED);
      window.fillOval(xPos, yPos, width/2, height/2);
      window.setColor(color.YELLOW);
      window.fillOval(xPos+width/4, yPos, width/2, height/2);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}