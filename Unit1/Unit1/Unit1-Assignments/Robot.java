//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jason Lin
//Date - 2/2/2018
//Class - Period 2
//Lab  - Lab 01D - ROBOT

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      Robot myRobot = new Robot();
      myRobot.head(window);
      
      //call other methods
      myRobot.upperBody(window);
      myRobot.lowerBody(window);
   
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.GREEN);
      window.fillOval(350, 125, 20, 20);
      window.fillOval(430, 125, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(395, 150, 15, 7);
      window.drawArc(345, 155, 110, 30, 30,-240);
		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.BLUE);
	   window.fillRect(325, 225, 150, 120);
	   window.setColor(Color.DARK_GRAY);
	   window.drawLine(325, 225, 230, 145);
	   window.drawLine(475, 225, 570, 145);
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.LIGHT_GRAY);
	   window.fillRect(325, 370, 150, 120);
	   window.setColor(Color.yellow);
	   window.drawRect(325, 370,  151, 121);
	   window.setColor(Color.DARK_GRAY);
	   window.drawLine(325, 490, 230, 570);
	   window.drawLine(475, 490, 570, 570);
		//add more code here

   }
}