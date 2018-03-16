//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word1 implements Comparable<Word1>
{
	private String word;

	public Word1( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int i = 0; i<word.length(); i++){
			for(int j = 0; j<vowels.length(); j++){
				if(word.charAt(i) == (vowels.charAt(j))){
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}

	public int compareTo(Word1 rhs)
	{
		if(numVowels() > rhs.numVowels()){
			return 1;
		}
		if(numVowels() == rhs.numVowels()){
			return 0;
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}