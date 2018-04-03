//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

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

public class Pong extends Canvas implements KeyListener, Runnable
{
//	private Ball ball;
//	private BlinkyBall ball;
	private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore = 0;
	private int leftScore = 0;


	public Pong()
	{
		//set up all variables related to the game
//		ball=new Ball();
//		ball=new BlinkyBall();
		ball=new SpeedUpBall();
		leftPaddle=new Paddle(100,10,10,50,3);
		rightPaddle=new Paddle(680,10,10,50,3);
		

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
		graphToBack.drawString("rightScore: " + rightScore, 500, 50);
		graphToBack.drawString("leftScore: " +leftScore, 500, 30);

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()+ball.getWidth()<=rightPaddle.getX() && ball.getX()+ball.getWidth()>=leftPaddle.getX()+leftPaddle.getWidth()))
		{
			if(ball.getX()<=rightPaddle.getX()-ball.getWidth()) {
				rightScore++;
			}
			if(ball.getX()>=leftPaddle.getX()+leftPaddle.getWidth()-ball.getWidth()) {
				leftScore++;
			}
			ball.setXSpeed(0);
			ball.setYSpeed(0);
//			ball=new Ball();
//			ball=new BlinkyBall();
			ball=new SpeedUpBall();

			update(graphToBack);
		}

		
		//see if the ball hits the top or bottom wall 

		if(!(ball.getY()>=10 && ball.getY()<=560))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the left paddle
		
/*		if(ball.getX()<=leftPaddle.getX()+leftPaddle.getWidth()-ball.getXSpeed()
		&& ball.getY()>=leftPaddle.getY()
		&& ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()){
*/
		if(ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		//see if the ball hits the right paddle
/*		if(ball.getX()+ball.getWidth()>=rightPaddle.getX()-ball.getXSpeed()
		&& ball.getY()>=rightPaddle.getY()
		&& ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight()){
*/
		if(ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}	
		

		//see if the paddles need to be moved
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
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