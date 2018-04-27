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
public class Race extends Canvas implements KeyListener, Runnable
{
	private boolean[] keys;
	private BufferedImage back;
	private Car car;

	private Lane[] lanes;
	private ArrayList<Block>obstacles;

	public Race()
	{
		//8 lanes
		keys=new boolean[2];
		car = new Car(300,400);

		lanes= new Lane[9];
		obstacles = new ArrayList<Block>();
		
		
		
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
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(0,0,800,600);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("ROAD RACER ", 25, 50 );
			car.draw(graphToBack);
			graphToBack.setColor(Color.MAGENTA);
			for (int i=0; i<9; i++){
				Lane l = new Lane((i*80)+60);
				lanes[i]=l;
				l.draw(graphToBack);
			}
			Random r = new Random();
			int m= r.nextInt(1000);
			if (m%49==0){
				int k =r.nextInt(9);
				Block b =new Block(lanes[k].returnx1(),0,80,80,2);
				obstacles.add(b);
				
			}
			for (Block b: obstacles){
				b.draw(graphToBack);
				b.move("DOWN");
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
			
			
			
			
			
			
			
			
			
	
			
			
			twoDGraph.drawImage(back, null, 0, 0);

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