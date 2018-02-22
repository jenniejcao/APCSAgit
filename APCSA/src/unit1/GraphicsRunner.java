package unit1;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("GRAPHICS RUNNER");

		setSize(WIDTH,HEIGHT);
		//getContentPane().add(new SmileyFace());
		getContentPane().add(new Robot());
		//getContentPane().add(new ShapePanel());
		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}