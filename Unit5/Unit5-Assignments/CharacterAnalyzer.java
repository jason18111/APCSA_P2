//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jason Lin
//Date - 2/8/18
//Class - Period 2
//Lab  - Lab05d

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{	
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar == Character.toUpperCase(theChar)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isLower( )
	{
		if (theChar == Character.toLowerCase(theChar)){
			return true;
		}
		else{
			return false;
		}

	}
	
	public boolean isNumber( )
	{
		int ASCII = (int) theChar;
		if (ASCII >= 48 && ASCII <=39){
			return true;
		}
		else {
			return false;
		}
	}	

	public int getASCII( )
	{
		int ASCII = (int) theChar;
		return ASCII;
	}

	public String toString()
	{
		if (isUpper() == false){
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		else{
			return getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	  
		}
	}
}