import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class EnemyAmmo {
	private List<Ammo> ammo;

	public EnemyAmmo()
	{
		ammo=new ArrayList <Ammo> ();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i<ammo.size(); i++){
			ammo.get(i).draw(window);
		}
	}
	public void moveEmAll()
	{
		for(int i = 0; i<ammo.size(); i++){
			ammo.get(i).move("DOWN");
		}
	}
	
	public void removeAll() {
		ammo.clear();
	}
	
	public List<Ammo> getList()
	{
		return ammo;
	}
	
	public boolean loss (Ship ship){
		for(int i = 0; i<ammo.size(); i++) {
			if(ammo.get(i).getX()+ammo.get(i).getWidth()+ammo.get(i).getSpeed()-15 > ship.getX() && ammo.get(i).getX()+ammo.get(i).getSpeed() < ship.getX()+ship.getWidth()-15
					&& ammo.get(i).getY()+ammo.get(i).getHeight() <= ship.getY()+ship.getHeight() && ammo.get(i).getY()+ammo.get(i).getHeight() >= ship.getY()){
				return true;
			}
		}
		return false;
	}
}
