//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();

	}

	public Histogram(char[] values, String fName)
	{
		for (int i= 0; i<values.length; i++){
			letters.add(values[i]);
		}
		out.println("search letters = "+letters);
		fileName = fName;
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(fileName);
		while (file.hasNext()){
			for(int i = 0; i<letters.size(); i++){
				if(file.next().equals(letters.get(i))){
					count.add(i, count.get(i)+1);
				}
			}
		}
	}

	public char mostFrequent()
	{
		int holder = 0;
		for (int i = 0; i<count.size(); i++){
			if (count.get(i)>holder){
				holder = count.get(i);
			}
		}
		return letters.get(holder);
	}

	public char leastFrequent()
	{
		int holder = 0;
		for (int i = 0; i>count.size(); i++){
			if (count.get(i)<holder){
				holder = count.get(i);
			}
		}
		return letters.get(holder);

	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}