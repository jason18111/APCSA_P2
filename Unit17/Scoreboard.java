import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

public class Scoreboard {
	private int level=1;

	public Scoreboard(){
	}
	public void draw(Graphics window){
		window.setColor(Color.WHITE);
		window.setFont(new Font("Verdana", Font.BOLD, 12));
		window.drawString("level: "+level, 700, 50);
	}
	public void beatLevel(Graphics window){
		window.setFont(new Font("Verdana", Font.BOLD, 60));
		window.setColor(Color.YELLOW);
		window.drawString("Beat Level: " + level , 300, 200);
		level++;
		
	}

}
