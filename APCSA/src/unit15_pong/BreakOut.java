package unit15_pong;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;


// 	USING A & D INSTEAD OF W & Z
// USING NEW MOVERIGHT AND LEFT METHODS FROM PADDLE


public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	//privateSpeedUpBall ball;
	//private BlinkyBall ball;
	
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private Wall wallLeft;
	private Wall wallRight;
	private Wall wallTop;
	private Wall wallBottom;

	private Block block1;
	private Block block2;
	private Block block3;
	private Block block4;

	public BreakOut()
	{
		//set up all variables related to the game
		ball = new Ball(300, 20, 10, 10, Color.BLACK, 3, 3);		
		paddle = new Paddle(760,300,100,30, Color.GREEN,5);
		block1 = new Block (50,150,100,30);
		block2 = new Block (250,150,100,30);

		block3 = new Block (450,150,100,30);
		block4 = new Block (650,150,100,30);

		// set up walls
		wallLeft = new Wall();
		wallRight = new Wall(760,0);
		wallBottom = new Wall(20,530,800,20);
		wallTop = new Wall(20,0,800,20);
	
		
		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }
   
   

   public void paint(Graphics window)
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
		//graphToBack.drawString("Left Player: " + LeftScore + "\nRight Player: " + RightScore, 300, 400);


		ball.moveAndDraw(graphToBack);
	
		paddle.draw(graphToBack);
		wallLeft.draw(graphToBack);
		wallRight.draw(graphToBack);
		wallTop.draw(graphToBack);
		wallBottom.draw(graphToBack);
		
		block1.draw(graphToBack);		
		block2.draw(graphToBack);
		block3.draw(graphToBack);
		block4.draw(graphToBack);

		
		//see if ball hits left wall or right wall
	//	if((ball.getX()<=20) || ball.getX()>=770)
		if (ball.didCollideLeft(wallLeft) || ball.didCollideRight(wallRight))
		{
			//ball.setXSpeed(0);
			//ball.setYSpeed(0);

			if (ball.didCollideLeft(wallLeft)){
			//if (ball.getX()<=leftPaddle.getX() + leftPaddle.getWidth()){
				//graphToBack.setColor(Color.WHITE);
				//graphToBack.drawString("Right Paddle: "+RightScore, 300, 500);
				
				ball.setXSpeed(-ball.getXSpeed());

				
			}
			 if (ball.didCollideRight(wallRight)){
				//graphToBack.setColor(Color.WHITE);
				//graphToBack.drawString("Left Paddle: "+LeftScore, 200, 500);
					ball.setXSpeed(-ball.getXSpeed());

				
			}
			/*	graphToBack.setColor(Color.WHITE);
				
				graphToBack.setColor(Color.RED);

			
			
				ball.draw(graphToBack, Color.WHITE);
				
				
			ball.setX(300);
			ball.setY(30);
			graphToBack.setColor(Color.BLUE);

			ball.setXSpeed(ball.getXSpeed()+1);
			ball.setYSpeed(ball.getYSpeed()+1);*/
			
		}
if (ball.didCollideBottom(wallBottom)) {
	ball.setXSpeed(0);
	ball.setYSpeed(0);
	
	ball.draw(graphToBack, Color.WHITE);
	
	ball.setX(60);
	ball.setY(400);
	
	ball.setXSpeed(ball.getXSpeed()+3);
	ball.setYSpeed(ball.getYSpeed()+2);
}
		
		//see if the ball hits the top or bottom wall 

	//	if (!(ball.getY()>=0 && ball.getY()<=550)){
		//	ball.setYSpeed(-ball.getYSpeed());

	//	}	
		
		//collide methods and see if ball hit top
		//or bottom wall
	/*	if (!(ball.getY()>=20 && ball.getY()<=530)){
		ball.setYSpeed(-ball.getYSpeed());
		}*/
		
		if (ball.didCollideBottom(wallTop) || ball.didCollideTop(wallBottom)) {
			ball.setYSpeed(-ball.getYSpeed());
		}		
		if (ball.didCollideRight(paddle) || ball.didCollideLeft(paddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		
		
		else if (ball.didCollideTop(paddle) || ball.didCollideBottom(paddle)){
			ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
			
		}
		
		else if (ball.didCollideTop(block1)|| ball.didCollideBottom(block1)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());	
			block1.draw(graphToBack, Color.WHITE);
			block1.setWidth(0);
			block1.setHeight(0);
		}
		else if (ball.didCollideTop(block2)|| ball.didCollideBottom(block2) || ball.didCollideLeft(block2) || ball.didCollideRight(block2)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());	
			block2.draw(graphToBack, Color.WHITE);

			block2.setWidth(0);
			block2.setHeight(0);
		}
		else if (ball.didCollideTop(block3)|| ball.didCollideBottom(block3)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			block3.draw(graphToBack, Color.WHITE);

			block3.setWidth(0);
			block3.setHeight(0);
		}
		else if (ball.didCollideTop(block4)|| ball.didCollideBottom(block4)) {
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			block4.draw(graphToBack, Color.WHITE);

			block4.setWidth(0);
			block4.setHeight(0);
		}
//code befoREd collidable stuff got implemented
		//see if the ball hits the left paddle
		
	/*	if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())){
			if ((ball.getY() >= leftPaddle.getY())&&(ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()))
				{
				if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
				}
				}
			else if (((leftPaddle.getY() <= ball.getY() + ball.getHeight() ) ) &&  (ball.getY() + ball.getHeight() > leftPaddle.getY() + leftPaddle.getHeight())){
				
				if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
				}
			}
		}
		
		
		//see if the ball hits the right paddle
		
		if (ball.getX() <= rightPaddle.getX() + Math.abs(ball.getXSpeed())){
			if ((ball.getY() >= rightPaddle.getY())&&(ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()))
				{
				if (ball.getX() <= rightPaddle.getX()  - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
				}
				}
			else if (((rightPaddle.getY() <= ball.getY() + ball.getHeight() ) ) &&  (ball.getY() + ball.getHeight() > rightPaddle.getY() + rightPaddle.getHeight()))
			{
				if (ball.getX() <= rightPaddle.getX()  - Math.abs(ball.getXSpeed())){
					ball.setYSpeed(-ball.getYSpeed());
	
				}
				else {
					ball.setXSpeed(-ball.getXSpeed());
	
				}
			}
		}
		*/


		//see if the paddles need to be moved

		if (keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveRightAndDraw(graphToBack);

		}













		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=true; break;
			case 'D' : keys[1]=true; break;

		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'A' : keys[0]=false; break;
			case 'D' : keys[1]=false; break;

		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}