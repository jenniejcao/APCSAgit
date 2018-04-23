package unit17;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	
	private Aliens alienmaker; //
	private Alien[][] alienmat; //

	/* uncomment once you are ready for this part */
	 
	private ArrayList<Alien> aliens;
	
	private ArrayList<Ammo> shots;
	


	private int points;
	
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(300,400,5);
		alienOne=new Alien(200,100,2);
		alienTwo = new Alien(100,100,3);
		shots=new ArrayList<Ammo>();
		aliens=new ArrayList<Alien>();
		
		//
		alienmaker = new Aliens();
		alienmat = new Alien[3][3];
		alienmat=alienmaker.returnAliens();
		points=0;
		
		for (int i=0; i<alienmat.length; i++){
			for (int j=0; j<alienmat[0].length; j++){
				Alien a = alienmat[i][j];
				aliens.add(a);
			}
		}
	//


		aliens.add(alienOne);
		aliens.add(alienTwo);
		

		//instantiate other stuff

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

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		
		ship.draw(graphToBack);
		/*
		alienOne.draw(graphToBack);
		alienTwo.draw(graphToBack);
		*/
		for (Alien a: aliens){
			a.draw(graphToBack);
			
		}

		if(keys[0] == true){
			ship.move("LEFT");
		}
		if (keys[1]==true){
			ship.move("RIGHT");
		}
		if (keys[2]==true){
			ship.move("UP");
		}
		if (keys[3]==true){
			ship.move("DOWN");
		}
		if (keys[4]==true){
			Ammo a = new Ammo(ship.getX(), ship.getY(),2);
			shots.add(a);
			keys[4]=false;
			
		}
		graphToBack.drawString("Points: "+points, 300, 500);
		//add code to move stuff
		for (Ammo a:shots){
			a.draw(graphToBack);
			for (Alien al: aliens){
				if (aliens.size()>0){
					if ((a.getY()<=al.getY()+80 &&a.getY()>=al.getY())&& (a.getX()>=al.getX()&&a.getX()<=al.getX()+80)){
						al.setPos(1000, 1000);
						graphToBack.setColor(Color.BLACK);
						graphToBack.drawString("Points: "+points, 300, 500);
						
						points++;
				
						
				
					}
				}
			}
		}
		
		//add in collision detection
		for (Alien a: aliens){
			if (a.getX()>=800||a.getX()<=0){
				a.setSpeed(-a.getSpeed());
			}
			if ((a.getY()<=ship.getY()+80 &&a.getY()>=ship.getY())&& (a.getX()>=ship.getX()&&a.getX()<=ship.getX()+80)){
				
				ship.setPos(300, 400);
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Points: "+points, 300, 500);
				
				points=0;
								
			}
		}
		
		if (ship.getX()<0){
			ship.setX(800);
		}
		if (ship.getX()>800){
			ship.setX(0);
		}
		if (ship.getY()<0){
			ship.setY(600);
		}
		if(ship.getY()>600){
			ship.setY(0);
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
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
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
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
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