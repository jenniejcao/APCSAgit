package javafinal;
import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Locatable
{
	private int xPos;
	private int yPos;
	private Color color;
	private int width;
	private int height;
	private int speed;

	public MovingThing()
	{
		xPos=0;
		yPos=0;
	}

	public MovingThing(int x, int y)
	{
		xPos=x;
		yPos=y;
	}
	public MovingThing(int x, int y, int w, int h, int s){
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		speed=s;
	}
	public MovingThing(int x, int y, int w, int h, int s, Color c){
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		speed=s;
		color=c;
	}


	public void setPos( int x, int y)
	{
		xPos=x;
		yPos=y;
	}


	public void setX(int x){
		xPos=x;
	}

	public void setY(int y){
		yPos=y;
	}
	public void setHeight(int h){
		height=h;
	}
	public void setWidth(int w){
		width=w;
	}
	public void setColor(Color col){
		color=col;
	}
	public void setSpeed(int s){
		speed=s;
	}

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

	public int getSpeed(){
		return speed;
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
	  


	public void move(String direction)
	{
		  //add more code to complete the move method
		
		if (direction.equals("UP")){
			setY(getY()-getSpeed());
		}
		else if (direction.equals("DOWN")){
			setY(getY()+getSpeed());
		}
		

    
	}

	public String toString()
	{
		return getX()+" "+getY()+" ";
	}
}