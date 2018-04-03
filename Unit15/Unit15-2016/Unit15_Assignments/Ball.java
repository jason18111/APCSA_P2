//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = -1;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x, y);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		xSpeed=3;
		ySpeed=1;
	}
	public Ball(int x, int y , int width, int height, Color col, int xSpd, int ySpd) {
		super(x, y , width, height, col);
		xSpeed=xSpd;
		setXSpeed(xSpd);
		setYSpeed(ySpd);
	}
	   
   //add the set methods
	public void setXSpeed(int xSpd){
		xSpeed=xSpd;
	}
	public void setYSpeed(int ySpd){
		ySpeed=ySpd;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   
	  draw(window, Color.WHITE);
      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball ball = (Ball) obj;
		Block block = (Block) obj;
		if(block == (Block)this && xSpeed==ball.getXSpeed() && ySpeed==ball.getYSpeed()){
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}
   //add a toString() method
	public String toString(){
		String output = this.getX() + " " + this.getY() + " " + this.getWidth() + " " + this.getHeight() + " " + this.getColor() + " " + xSpeed + " " + ySpeed;
		return output;
	}
	public boolean didCollideLeft(Object obj){
		Paddle paddle = (Paddle) obj;
		if(this.getX()<=paddle.getX()+paddle.getWidth()-this.getXSpeed()
		&& this.getY()>=paddle.getY()
		&& this.getY()<=paddle.getY()+paddle.getHeight()){
			return true;
		}
			return false;
	}
	public boolean didCollideRight(Object obj){
		Paddle paddle = (Paddle) obj;
		if(this.getX()+this.getWidth()>=paddle.getX()-this.getXSpeed()
		&& this.getY()>=paddle.getY()
		&& this.getY()<=paddle.getY()+paddle.getHeight()){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block block = (Block) obj;
		if((this.getY()<=block.getY()+this.getHeight()+block.getHeight() && this.getY()>=block.getY()+block.getHeight())
				&& this.getX()>=block.getX() && this.getX()<=block.getX()+block.getWidth()){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj) {
		Block block = (Block) obj;
		if((this.getY()<=block.getY()+this.getHeight() && this.getY()>=block.getY())
				&& this.getX()>=block.getX() && this.getX()<=block.getX()+block.getWidth()){
			return true;
		}
		return false;
	}
}