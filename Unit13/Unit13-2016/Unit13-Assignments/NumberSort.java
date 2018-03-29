//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown
	private int[] digits;
	
	
	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number>0){
			count++;
			number /= 10;
		}
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for(int i = 0; i<sorted.length; i++){
			sorted[i]=number%10;
			number/=10;
		}
		for(int i=0; i<sorted.length; i++){
			for(int j=i+1; j<sorted.length; j++){
				if(sorted[j]<sorted[i]){
					int holder = sorted[j];
					sorted[j]=sorted[i];
					sorted[i]=holder;
				}
			}
		}
		return sorted;
	}
}