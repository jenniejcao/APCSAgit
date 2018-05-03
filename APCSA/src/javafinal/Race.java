package javafinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Race extends Canvas implements KeyListener, Runnable
{
	private boolean[] keys;
	private BufferedImage back;
	private Car car;
	private boolean cont;
	private Lane[] lanes;
	private ArrayList<Block>obstacles;
	private long start;
	private long end;
	private int setdiff;
	private int stage;
	private String time;
	private boolean playAgain;
	public Race()
	{
		//8 lanes
		keys=new boolean[4];
		car = new Car(300,400);
		cont=true;
		lanes= new Lane[9];
		obstacles = new ArrayList<Block>();
		setdiff=1;
		start=System.currentTimeMillis();
		end=start;
		stage=0;
		playAgain=false;
	
		setBackground(Color.WHITE);
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}
	  public void update(Graphics window)
	   {
		   paint(window);
	   }
	  public void paint( Graphics window )
		{
			//set up the double buffering to make the game animation nice and smooth
			Graphics2D twoDGraph = (Graphics2D)window;

			//take a snap shop of the current screen and same it as an image
			//that is the exact same width and height as the current screen
			if(back==null)
			   back = (BufferedImage)(createImage(getWidth(),getHeight()));

			//create a graphics reference to the back ground image
			//we will draw all changes on the background image
			Graphics graphToBack = back.createGraphics();
			if (stage==0){
				graphToBack.drawString("Play RoadRacer!", 200, 100);
				graphToBack.drawString("Avoid all the obstacles by pressing the arrow keys!", 200, 200);
				graphToBack.drawString("Press space to continue!", 200, 300);
				graphToBack.drawString("made by me", 200, 400);
				if (keys[2]==true){
					stage=1;
				}
			}
			else if (stage==1){

			graphToBack.setColor(Color.BLACK);
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.WHITE);
			graphToBack.drawString("ROAD RACER ", 25, 50 );
			car.draw(graphToBack);
			graphToBack.setColor(Color.MAGENTA);
			for (int i=0; i<9; i++){
				Lane l = new Lane((i*80)+60);
				lanes[i]=l;
				l.draw(graphToBack);
			}
			
			Random r = new Random();
			int m= r.nextInt(40);
			if (m==0&&cont){
				int k =r.nextInt(9);
				Block b =new Block(lanes[k].returnx1(),0,80,80,2,"penguin.png");
				obstacles.add(b);
				
			}
			for (Block b: obstacles){
				b.draw(graphToBack);
				b.move("DOWN");
				if (car.didCollideTop(b)||car.didCollideBottom(b)){
					for (Block bl: obstacles){
						bl.setSpeed(0);
						
					}
					
					cont=false;
				
					graphToBack.setColor(Color.BLACK);
					graphToBack.fillRect(50, 50, 200, 100);
					graphToBack.setColor(Color.WHITE);
					graphToBack.drawString("Press enter to play again!!", 100, 100);
					if (keys[3]==true){
						keys[3]=false;
						RaceRunner go = new RaceRunner();
					
					}
					
					
				}
			 	
			    }  
			
			if (cont==false&&end==start){
			
			
				end=System.currentTimeMillis();
				double timeins = (end-start)/1000.0;
				time=String.format("%.2f",timeins);
				time=("Time: "+time+" seconds");
				System.out.println(time);
		
				
				
				
			}
			
			if (System.currentTimeMillis()==start+setdiff*3000){
				setdiff++;
				for (Block b: obstacles){
					b.setSpeed(b.getSpeed()+1);
				}
			}
			
			//movement
			if (car.getX()==60&&keys[0]==true){
				keys[0]=false;
			}
			if (car.getX()==620&&keys[1]==true){
				keys[1]=false;
			}
			if (keys[0]==true){
				
				car.move("LEFT");
				keys[0]=false;
			}
			if (keys[1]==true){
				car.move("RIGHT");
				keys[1]=false;
			}
			
			
			
			
			
			
			
		

			
	
			}
			
			twoDGraph.drawImage(back, null, 0, 0);

}
	  public String getTime(){
		  return time;
	  }
	
		public void keyPressed(KeyEvent e)
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				keys[0] = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				keys[1] = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_SPACE);{
				keys[2]=true;
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER);{
				keys[3]=true;
			}
			
			
			
			repaint();
		}

		public void keyReleased(KeyEvent e)
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				keys[0] = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				keys[1] = false;
			}
			if (e.getKeyCode() == KeyEvent.VK_SPACE);{
				keys[2]=false;
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER);{
				keys[3]=false;
			}

			repaint();
		}

		public void keyTyped(KeyEvent e)
		{

		}

	   public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }catch(Exception e)
	      {
	      }
	  	}
	   
}