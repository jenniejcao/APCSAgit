package unit15_pong;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed=3;
		ySpeed=1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super (x,y);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht){
		super (x,y,wid,ht);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht, Color col){
		super (x,y,wid,ht,col);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int wid, int ht, Color col, int xS, int yS){
		super(x,y,wid,ht,col);
		xSpeed=xS;
		ySpeed=yS;
	}
	
   //add the set methods
	
   public void setColor(Color col)
   {
	  super.setColor(col);

   }
	public void setXSpeed(int xS){
		xSpeed=xS;
	}
	public void setYSpeed(int yS){
		ySpeed=yS;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window,Color.WHITE);
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window,Color.BLACK);
      
   }
   
	public boolean equals(Object obj)
	{
		Ball ob = (Ball) obj;
		if (ob.getXSpeed()==getXSpeed()&&ob.getYSpeed()==getYSpeed()){
			return super.equals(ob);
		}

		return false;
	}   

   //add the get methods
	

	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}

   //add a toString() method
	public String toString(){
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor()+" xSpeed: "+getXSpeed()+" ySpeed:."
				+ " "+getYSpeed();
	}

@Override
public boolean didCollideLeft(Object obj) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideRight(Object obj) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideTop(Object obj) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean didCollideBottom(Object obj) {
	// TODO Auto-generated method stub
	return false;
}
}