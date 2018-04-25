package javafinal;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends MovingThing implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int speed;


	public Block()
	{
		xPos=100;
		yPos=100;
		width=10;
		height=10;
		speed=3;

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
	public Block(int x, int y, int w, int h, int s){
		this();
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		speed=s;
	
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
	public void setSpeed(int s){
		speed=s;
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
   public int getSpeed(){
	   return speed;
   }

   public void draw(Graphics window)
   {
   	
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   
	public boolean equals(Object obj)
	{
		Block ob = (Block) obj;
		if (ob.getX()==getX()&&ob.getY()==getY()&&ob.getHeight()==getHeight()&&ob.getWidth()==getWidth()){
			return true;
		}

		return false;
	}   

    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" speed: "+getSpeed();
	}


}
