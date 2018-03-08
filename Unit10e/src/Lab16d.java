//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab16d
{
	public static void main( String args[] ) throws FileNotFoundException
	{
		//make a new MadLib
		Scanner file = new Scanner(new File("C:\\Users\\linj6200\\Desktop\\APCSA_P2\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\story.dat"));
		//while(file.hasNext()){
		//	out.println(file.next());
		//}
		System.out.println(file);
		
		
		//MadLib myMadLib = new MadLib("C:\\Users\\linj6200\\Desktop\\APCSA_P2\\Unit10e\\src\\story.dat");
		//System.out.println(myMadLib);
		//out.println("\n");
	}
	
}
