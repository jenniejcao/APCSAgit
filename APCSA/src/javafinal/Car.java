package javafinal;

import java.io.File;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;


public class Car {
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
			image = ImageIO.read(new File("src/javafinal/ship.jpg")); //mac
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
	

}
