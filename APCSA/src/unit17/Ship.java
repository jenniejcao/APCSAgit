package unit17;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private String file="ship.java";

	public Ship()
	{
		this(0,0,0);
	}

	public Ship(int x, int y)
	{
		this(x,y,0);
	}

	public Ship(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("src/unit17/ship.jpg")); //mac
			//image = ImageIO.read(new File("src\\unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem!");
		}
	}
	
	public Ship(int x, int y, int s, String type)
	{
		super(x, y);
		speed=s;
		file=type;
		try
		{
			image = ImageIO.read(new File("src/unit17/"+file)); //mac
			//image = ImageIO.read(new File("src\\unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem!");
		}
	}



	public void setSpeed(int s)
	{
	   //add more code
		speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public String getType(){
		return file;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),80,80,null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}

	
}