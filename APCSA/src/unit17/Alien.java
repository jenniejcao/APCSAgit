package unit17;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.Random;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private int rand;
	

	public Alien()
	{
		this(0,0,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("src/unit17/alien.jpg")); //mac
			//image = ImageIO.read(new File("src\\unit17\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("GADHFJAKSDF");
		}
		Random r = new Random();
		rand=r.nextInt(10);
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),80,80,null);

		//if (rand%2==0){
			this.move("RIGHT");
		//}
		//else {
			
			//this.move("DOWN");
		//}
	
		/*
		//window.setColor(Color.BLACK);
		setX(getX()+getSpeed());
		//window.drawImage(image,getX(),getY(),80,80,null);
		 * */
		 
	}

	public String toString()
	{
		return super.toString()+getSpeed();
	}
	public static void main(String args[]){
		Alien a = new Alien(200,300,5);
		System.out.println("Alien a: "+a);
	}
}