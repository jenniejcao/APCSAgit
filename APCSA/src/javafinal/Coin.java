package javafinal;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.Image;
public class Coin extends MovingThing implements Locatable {
	
private Image image;

	public Coin()
	{
		super(0,0,0,0,0, Color.BLUE);

	}

	//add other Block constructors - x , y , width, height, color
	public Coin(int x, int y){
		super(x,y,0,0,0, Color.RED);
		
	}
	public Coin(int x, int y, int w, int h){
		super(x,y,w,h,0,Color.RED);
	
	}
	public Coin(int x, int y, int w, int h, int s){
		super (x,y,w,h,s,Color.RED);	
	}
	public Coin(int x, int y, int w, int h, int s, Color col){
		super (x,y,w,h,s,col);	
	}
	public Coin(int x, int y, int w, int h, int s,  String file){
		super (x,y,w,h,s);	
	
		try
		{
			image = ImageIO.read(new File("src/javafinal/"+file)); //mac
			//image = ImageIO.read(new File("src\\unit17\\ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Houston, we have a problem!");
		}
	}
	//add the other set methods
	
	
   
   public void draw( Graphics window){
		
		window.drawImage(image,getX(),getY(),80,80,null);
	}
  
   

    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" speed: "+getSpeed();
	}
	public static void main(String args[]){
		Coin b = new Coin(10,10,30,30,4);
		System.out.println(b);
	}


}
