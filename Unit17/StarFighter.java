//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private static final JButton button = new JButton();
	
	public StarFighter()
	{
		super("STARFIGHTER");
		setSize(WIDTH,HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);

//		getContentPane().add(button);
//		button.setText("Play Again?");
//		button.setSize(10, 10);
//		button.setBounds(350, 250, 100, 50);
		getContentPane().add(theGame);
		setVisible(true);
//		button.setVisible(false);
	}

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
//		button.setVisible(true);
	}
}