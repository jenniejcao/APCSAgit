package javafinal;

import java.io.File;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;


public class Car implements Collidable{
	private int xPos;
	private int yPos;
	private Image image;
	private int speed;
	public Car(){
		this(400,400);
	}
	public Car(int x, int y){
		xPos=x;
		yPos=y;
		try
		{
			image = ImageIO.read(new File("src/javafinal/car.png")); //mac
			//image = ImageIO.read(new File("src\\unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem!");
		}
	}
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public void setX(int x){
		xPos=x;
	}
	public void setY(int y){
		yPos=y;
	}
	public void setPos(int x, int y){
		xPos=x;
		yPos=y;
	}
	public void draw( Graphics window )
	{
		
		window.drawImage(image,getX(),getY(),80,80,null);
	}
	
	public void move(String direction){
		
		
		if(direction.equals("LEFT")){
		      setX(getX()-80);
			}
		else if (direction.equals("RIGHT")){
			setX(getX()+80);
			}
	}
	@Override
	public boolean didCollideLeft(Object obj) {
		MovingThing b = (MovingThing)obj;
		if ((didCollideTop(b)||didCollideBottom(b))){
			return true;
		}
		return false;
	}
	@Override
	public boolean didCollideRight(Object obj) {
		MovingThing b = (MovingThing)obj;
		if ((didCollideTop(b)||didCollideBottom(b))){
			return true;
		}
		return false;
	}
	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		MovingThing b = (MovingThing)obj;
		if ((getY()<= b.getY()+80&&(getY()>=b.getY()))&&getX()==b.getX()){
			return true;
		}
		return false;
	}
	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		MovingThing b = (MovingThing)obj;
		if ((getY()>= b.getY()&&(getY()+80<=b.getY()&&getY()+80<=b.getY()+80))&&getX()==b.getX()){
			return true;
		}
		return false;
	}
	

}
