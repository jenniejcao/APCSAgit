package javafinal;

import java.awt.Color;
import java.awt.Graphics;

public class Lane {
	private int xPos;
	
	public Lane(int x1){
		xPos=x1;
	}
	public int returnx1(){
		return xPos;
	}

	public void draw(Graphics window)
	   {
	   	//uncomment after you write the set and get methods
	      window.setColor(Color.BLUE);
	      window.drawLine(xPos,0,xPos,600);
	   }

}
