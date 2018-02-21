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
	private int numGuesses;

	
	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
	
		randomInt = (int) Math.round((Math.random() * (upperBound-1)) + 1);
//		System.out.println(randomInt);
	
		int num = 0;
		while(num != randomInt) {
			System.out.println("Enter a number between 1 and " + upperBound);
			Scanner keyboard = new Scanner(System.in);
			num = keyboard.nextInt();
			if(num > upperBound) {
				System.out.println("Number out of range!");
			}
			numGuesses++;
		}
	}




	public String toString()
	{
		double percentWrong = (double)(numGuesses -1)/(double)(numGuesses)*100.00;
		String output="It took " + numGuesses + " guesses to guess " + randomInt + "\n" + "You guessed wrong " + String.format("%.3f", percentWrong) + " percent of the time.";
		return output;
	}
}