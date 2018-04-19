//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private ArrayList<Alien> aliens = new ArrayList<Alien>();

	public AlienHorde(int size)
	{
		int x = 50;
		int y = 100;
		for(int i = 0; i<size; i++){
			aliens.add(new Alien(x, y, 40, 40, 1));
			x+=100;
			if(x>=700){
				x=50;
				y=150;
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		boolean left = true;
		boolean right = true;
		for(int i = 0; i<aliens.size(); i++){
			if(aliens.get(i).getX()>=700){
				right = false;
				left = true;
				for(int j = 0; j<aliens.size(); j++){
					aliens.get(j).move("DOWN");
				}
				break;
			}
			if(aliens.get(i).getX()<=100){
				left = false;
				right = true;
				for(int j = 0; j<aliens.size(); j++){
					aliens.get(j).move("DOWN");
				}
				break;
			}
		}
		for(int i = 0; i<aliens.size(); i++){
			if(right == true){
				aliens.get(i).move("RIGHT");
			}
			else if(left == true){
				aliens.get(i).move("LEFT");
			}
		}
		
	}

	public ArrayList<Integer> removeDeadOnes(List<Ammo> ammo)
	{
		ArrayList<Integer> ints = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i<ammo.size()){
			while(j<aliens.size()){
				if(ammo.get(i).getX()+ammo.get(i).getWidth() > aliens.get(j).getX() && ammo.get(i).getX() < aliens.get(j).getX()+aliens.get(j).getWidth()
						&& ammo.get(i).getY() <= aliens.get(j).getY()-aliens.get(j).getHeight()){
					aliens.remove(j);
					ints.add(i);
				}
				j++;
			}
		i++;
		}
		return ints;
	}

	public String toString()
	{
		return "";
	}
}
