package unit1;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   
   {
	  Robot fred = new Robot();
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public static void head( Graphics window )
   {
		//add more code here
	   window.setColor(Color.GRAY);
	   window.fillOval( 210, 100, 200, 200 );
	   window.setColor(Color.BLUE);
	   window.fillOval(250, 150, 20, 20);
	   window.fillOval(350, 150, 20, 20);
	   window.setColor(Color.RED);
	   window.fillOval(300, 200, 20, 20);
	   window.setColor(Color.BLUE);
	   window.drawArc(240, 225, 150, 50, 180, 180);
				
   }

   public static void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.BLUE);
	   window.fillRect( 210, 325, 210, 100 );
	   window.setColor(Color.RED);
	   window.drawLine(110, 325, 210, 325);
	   window.drawLine(420, 325, 500, 325);
   }

   public static void lowerBody( Graphics window )
   {
		//add more code here
	   window.setColor(Color.BLUE);
	   window.fillRect( 210, 435, 210, 150 );
	   window.setColor(Color.GREEN);
	   window.drawLine(110, 625, 210, 575);
	   window.drawLine(420, 575, 500, 625);
   }

}
