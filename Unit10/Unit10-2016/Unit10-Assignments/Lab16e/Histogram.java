//� A+ Computer Science  -  www.apluscompsci.com
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
		



	}

	public Histogram(char[] values, String fName)
	{
		for (int i= 0; i<values.length; i++){
			letters.add(values[0]);
		}
		out.println("search letters = "+letters);
		fileName = fName;
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner file = new Scanner(fileName);
		while (file.hasNext()){
			
		}
	}

	public char mostFrequent()
	{
		
			
		
		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}