//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	private static ArrayList <String> words;
	public static void main( String args[] ) throws IOException
	{
		words = new ArrayList <String> (); 
		Scanner file = new Scanner(new File("lab18d.dat"));
		int size = file.nextInt();
		file.nextLine();
		while(file.hasNext()){
			words.add(file.next());
		}
		
		for(int i = 0; i<size; i++){
			for(int j = i; j<size; j++){
				Word wordI = new Word(words.get(i));
				Word wordJ = new Word(words.get(j));
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