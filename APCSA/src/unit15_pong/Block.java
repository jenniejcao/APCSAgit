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
		xPos=100;
		yPos=150;
		width=10;
		height=10;
		color=Color.BLACK;

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y){
		this();
		xPos=x;
		yPos=y;
		
	}
	public Block(int x, int y, int w, int h){
		this();
		xPos=x;
		yPos=y;
		width=w;
		height=h;
	
	}
	public Block(int x, int y, int w, int h, Color col){
		this();
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		color= col;
	
	}
	//add the other set methods
	public void setPos(int x, int y){
		xPos=x;
		yPos=y;
	}
	   
	public void setX(int x){
		xPos=x;
	}
	public void setY(int y){
		yPos=y;
	}
	public void setWidth(int w){
		width=w;
	}
	public void setHeight(int h){
		height=h;
	}

   public void setColor(Color col)
   {
	   color=col;

   }
   //add the other get methods
   public int getX(){
	   return xPos;
   }
   public int getY(){
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
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block ob = (Block) obj;
		if (ob.getX()==getX()&&ob.getY()==getY()&&ob.getHeight()==getHeight()&&ob.getWidth()==getWidth()&&ob.getColor()==getColor()){
			return true;
		}

		return false;
	}   

    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor();
	}

}
