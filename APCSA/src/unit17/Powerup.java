package unit17;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;


public class Powerup {
	private Image image;
	private int xPos;
	private int yPos;
	public Powerup(int x, int y){
		xPos=x;
		yPos=y;
		try
		{
			
			image = ImageIO.read(new File("src/unit17/pu.jpg")); //mac
			//image = ImageIO.read(new File("src\\unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem!");
		}
		
	}
	public void setX(int x)
	{
		xPos=x;
		
	}


	public void setY(int y)
	{
		yPos=y;
	}

	public int getX()
	{
		return xPos;
	}


	public int getY()
	{
		return yPos;
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),80,80,null);
	}
	
}
