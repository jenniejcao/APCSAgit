package javafinal;

import java.awt.Color;
import java.awt.Graphics;

public class Block extends MovingThing implements Locatable {
	

	public Block()
	{
		super(0,0,0,0,0, Color.RED);

	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y){
		super(x,y,0,0,0, Color.RED);
		
	}
	public Block(int x, int y, int w, int h){
		super(x,y,w,h,0,Color.RED);
	
	}
	public Block(int x, int y, int w, int h, int s){
		super (x,y,w,h,s,Color.RED);	
	}
	public Block(int x, int y, int w, int h, int s, Color col){
		super (x,y,w,h,s,col);	
	}
	//add the other set methods
	
   

   public void moveAndDraw(Graphics window)
   {
	   draw(window,Color.BLACK);
	   setY(getY()+getSpeed());
		
	   draw(window);
     
      
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
	public static void main(String args[]){
		Block b = new Block(10,10,30,30,4);
		System.out.println(b);
	}


}
