//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public int getLength(){
		return word.length();
	}

	public int compareTo( Word rhs )
	{
		if(word.length() > rhs.getLength()){
			return 1;
		}
		else if(word.length() < rhs.getLength()){
			return -1;
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}