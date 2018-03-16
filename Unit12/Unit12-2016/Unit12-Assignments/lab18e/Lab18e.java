//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	private static ArrayList<String> words;
	
	public static void main( String args[] ) throws IOException
	{
		words = new ArrayList <String>(); 
		Scanner file1 = new Scanner(new File("lab18e.dat"));
		int size = file1.nextInt();
		file1.nextLine();
		while(file1.hasNext()){
			words.add(file1.next());
		}
		
		for(int i = 0; i<size; i++){
			for(int j = i; j<size; j++){
				Word1 wordI = new Word1(words.get(i));
				Word1 wordJ = new Word1(words.get(j));
				if(wordI.compareTo(wordJ)>0){
					String holder = words.get(i);
					words.set(i, words.get(j));
					words.set(j, holder);
				}
				if(words.get(i).compareTo(words.get(j))>0 && wordI.compareTo(wordJ)==0){
					String holder = words.get(i);
					words.set(i, words.get(j));
					words.set(j, holder);
				}
			}
		}
		for(int i = 0; i<size; i++){
			System.out.println(words.get(i));
		}
	}
}