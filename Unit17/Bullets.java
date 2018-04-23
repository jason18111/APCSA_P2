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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo=new ArrayList <Ammo> ();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<ammo.size(); i++){
			ammo.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i<ammo.size(); i++){
			ammo.get(i).move("UP");
		}
	}

	public void cleanEmUp(List<Alien> aliens)
	{
		for(int j = aliens.size()-1; j>=0; j--){
			for(int i = 0; i<ammo.size(); i++){
				if(ammo.get(i).getX()+ammo.get(i).getWidth() > aliens.get(j).getX() && ammo.get(i).getX() < aliens.get(j).getX()+aliens.get(j).getWidth()
						&& ammo.get(i).getY() <= aliens.get(j).getY()+aliens.get(j).getHeight() && ammo.get(i).getY()-ammo.get(i).getHeight() >= aliens.get(j).getY()){
					ammo.remove(i);
				}
			}
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}
