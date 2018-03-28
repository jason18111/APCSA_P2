//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private int max;
	
	
	public FancyWords(String sentence)
	{
		Scanner thing = new Scanner(sentence);
		wordRay = new String[sentence.length()];
		for(int i=0; i<wordRay.length; i++){
			wordRay[i] = thing.next();
		}
	}

	public void setWords(String sentence)
	{

	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;






		return output+"\n\n";
	}
}