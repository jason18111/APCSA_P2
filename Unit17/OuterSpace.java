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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
//	private ArrayList <Alien> alien= new ArrayList<Alien>();
	private ArrayList<Ammo> ammo = new ArrayList<Ammo>();
	private AlienHorde aliens = new AlienHorde(20);
    
	/* uncomment once you are ready for this part
	 *
   private AlienHorde horde;
	private Bullets shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		//instantiate other instance variables

		//Ship, Alien
//		alien.add(new Alien(150, 250, 30, 30, 1));
//		alien.add(new Alien(100, 100, 30, 30, 1));
		ship = new Ship(350, 500, 50, 50, 2);
		
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

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
/*		for(int i=0; i<alien.size(); i++){
			alien.get(i).draw(graphToBack);
		}
*/
		aliens.drawEmAll(graphToBack);
		for(int i=0; i<ammo.size(); i++){
			ammo.get(i).draw(graphToBack);
			ammo.get(i).move("UP");
		}

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1]==true){
			ship.move("RIGHT");
		}
		if(keys[2]==true){
			ship.move("UP");
		}
		if(keys[3]==true){
			ship.move("DOWN");
		}
		if(keys[4]==true){
			ammo.add(new Ammo(ship.getX()+ship.getWidth()/2-2 , ship.getY()-14, 3));
			keys[4]=false;
		}
		
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
/*		for(int i = 0; i<ammo.size(); i++){
			for(int j=0; j<alien.size(); j++){
				if(ammo.get(i).getX()+ammo.get(i).getWidth() > alien.get(j).getX() && ammo.get(i).getX() < alien.get(j).getX()+alien.get(j).getWidth()
						&& ammo.get(i).getY() <= alien.get(j).getY()-alien.get(j).getHeight()){
					alien.remove(j);
					ammo.remove(i);
				}
			}
		}
*/
		for(int i: aliens.removeDeadOnes(ammo)){
			ammo.remove(i);
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
      //no code needed here
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

