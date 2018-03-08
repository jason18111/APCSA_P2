//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String test="";
	
	public MadLib()
	{

		

	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				test += file.next();
				/*if(test.equals("#")){
					out.print(getRandomNoun() + " ");
				}
				else if(test.equals("@")){
					out.print(getRandomVerb() + " ");
				}
				else if(test.equals("&")){
					System.out.print(getRandomAdjective() + " ");
				}
				else{
					System.out.print(test + " ");
				}
				*/
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner inputNouns = new Scanner (new File("C:\\Users\\linj6200\\Desktop\\APCSA_P2\\Unit10e\\src\\nouns.dat"));
			while(inputNouns.hasNext())
			{
				nouns.add(inputNouns.next());	
			}
		}
		catch(Exception e)
		{
			System.out.println("Error 1");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner inputVerbs = new Scanner (new File("C:\\Users\\linj6200\\Desktop\\APCSA_P2\\Unit10e\\src\\verbs.dat"));
			while(inputVerbs.hasNext()){
				verbs.add(inputVerbs.next());
			}
	
		}
		catch(Exception e)
		{
			System.out.println("Error 2");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner inputAdjectives = new Scanner (new File("C:\\Users\\linj6200\\Desktop\\APCSA_P2\\Unit10e\\src\\adjectives.dat"));
			while(inputAdjectives.hasNext()){
				adjectives.add(inputAdjectives.next());
			}

	
		}
		catch(Exception e)
		{
			System.out.println("Error 3");
		}
	}

	public String getRandomVerb()
	{
		int random = (int)(Math.random())*(verbs.size()-1);
		return verbs.get(random);
	}
	
	public String getRandomNoun()
	{
		
		int random = (int)(Math.random())*(nouns.size()-1);
		return nouns.get(random);
	}
	
	public String getRandomAdjective()
	{
		int random = (int)(Math.random())*(adjectives.size()-1);
		return adjectives.get(random);
	}		

	public String toString()
	{
		//while(this.hasNext())
		String output = test;
		for(int d=0;d<test.length();d++)
			if(test.equals("#")){
				test = test.replaceFirst("#", getRandomNoun());
			}
			else if(test.equals("@")){
				test = test.replaceFirst("@", getRandomVerb());
			}
			else if(test.equals("&")){
				test = test.replaceFirst("&", getRandomAdjective());
			}
		
		return output;
	}
}