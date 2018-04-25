package javafinal;

import javax.swing.JFrame;
import java.awt.Component;

public class RaceRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public RaceRunner()
	{
		super("SUPER RACER"); 
		setSize(WIDTH,HEIGHT);

		Race theGame = new Race();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		RaceRunner run = new RaceRunner();
	}
}