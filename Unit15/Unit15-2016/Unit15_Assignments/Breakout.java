import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Breakout extends Canvas implements KeyListener, Runnable{
	private Paddle paddle;
	private Ball ball;
	private boolean[] keys;
	private BufferedImage back;
	
	
	public Breakout(){
		//set up all variables related to the game
//		ball=new Ball();
		ball=new Ball();
//		ball=new SpeedUpBall();
		paddle=new Paddle(10,100,10,50,3);
		

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
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(450, 0, 200, 150);
			graphToBack.setColor(Color.RED);


			Block topWall = new Block(0, 0, 800, 1, Color.BLACK);
			Block bottomWall = new Block(0, 560, 800, 1, Color.BLACK);
			topWall.draw(graphToBack);
			bottomWall.draw(graphToBack);
			ball.moveAndDraw(graphToBack);
			paddle.draw(graphToBack);

			//see if ball hits left wall or right wall



			
			//see if the ball hits the top or bottom wall 



			//see if ball hits paddles or blocks
			

			
			
			
			
			
			//see if the paddles need to be moved
			ball.moveAndDraw(graphToBack);
			paddle.draw(graphToBack);
			
			
			if(keys[1] == true)
			{
				//move left paddle up and draw it on the window
				paddle.moveUpAndDraw(graphToBack);
			}
			if(keys[0] == true)
			{
				//move left paddle down and draw it on the window
				paddle.moveDownAndDraw(graphToBack);
			}
			if(keys[3] == true)
			{
				paddle.moveUpAndDraw(graphToBack);
			}
			if(keys[2] == true)
			{
				paddle.moveDownAndDraw(graphToBack);
			}

			twoDGraph.drawImage(back, null, 0, 0);
			}

		public void keyPressed(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=true; break;
				case 'Z' : keys[1]=true; break;
				case 'I' : keys[2]=true; break;
				case 'M' : keys[3]=true; break;
			}
		}

		public void keyReleased(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=false; break;
				case 'Z' : keys[1]=false; break;
				case 'I' : keys[2]=false; break;
				case 'M' : keys[3]=false; break;
			}
		}

		public void keyTyped(KeyEvent e){}
	

}
