//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   for(int i = 0; i<s.length(); i++){
		   mat[0][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[i][s.length()-i-1] = s.charAt(s.length()-i-1);
		   mat[s.length()-1][i] = s.charAt(i);
	   }
	   
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat[i].length; j++){
				output += mat[i][j];
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}