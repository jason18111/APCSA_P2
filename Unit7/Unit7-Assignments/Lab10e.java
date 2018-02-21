//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	
	public static void main(String args[])
	{
		
		boolean playAgain = true;
		System.out.println("Guessing Game - how many numbers?");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		GuessingGame myGuessingGame = new GuessingGame(num1);
		myGuessingGame.playGame();
		System.out.println(myGuessingGame);
		
		while (playAgain == true) {
				System.out.println("Do you want to play again? (y for yes) ");
				Scanner keyboard1 = new Scanner(System.in);
				String play = keyboard1.nextLine();
				if(play.equals("y") == true || play.equals("yes") == true) {
					playAgain = true;
				}
				else{
					playAgain = false;
				}
			if(playAgain == true) {
				System.out.println("Guessing Game - how many numbers?");
				Scanner keyboard2 = new Scanner(System.in);
				int num2 = keyboard2.nextInt();
				GuessingGame myGuessingGame2 = new GuessingGame(num2);
				myGuessingGame2.playGame();
				System.out.println(myGuessingGame2); 
			}
		}
	}
}