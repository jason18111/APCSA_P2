//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = ' ';
	}

	//add in second constructor
	public LetterRemover(String s, char rem){
		
		setRemover(s, rem);
		
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned= "";
			for (int i = 0; i <= sentence.length()-1; i++){
				if(sentence.charAt(i) != lookFor){
					cleaned += sentence.charAt(i);
				}
			}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}