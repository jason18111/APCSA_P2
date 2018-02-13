//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int randomInt;
	
	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		randomInt = Math.round(Math.random*1, );




	}

	public String toString()
	{
		String output="It took " + numGuesses + " guesse sto guess " + randInt;
		return output;
	}
}