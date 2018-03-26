package unit15_pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int h){
		xPos=x;
		yPos=y;
		width=w;
		height=h;
	
	}
	//add the other set methods
	   
	public void setx(int x){
		xPos=x;
	}
	public void sety(int y){
		yPos=y;
	}
	public void setWidth(int w){
		width=w;
	}
	public void setHeight(int w){
		width=w;
	}

   public void setColor(Color col)
   {
	   color=col;

   }
   //add the other get methods
   public int getx(){
	   return xPos;
   }
   public int gety(){
	   return yPos;
   }
   public int getHeight(){
	   return height;
   }
   public int getWidth(){
	   return width;
   }
   public Color getColor(){
	   return color;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   

    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return "x: "+getx()+" y: "+gety()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor();
	}
}
