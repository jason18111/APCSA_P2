//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab14d
{
	
	
	public static void main( String args[] )
	{
		//add test cases
		
		
		System.out.println("How many grades would you like to input?");
		Scanner len = new Scanner(System.in);
		int length = len.nextInt();
		double array[] = new double [length];
		for (int i = 0; i < length; i++){
			System.out.println("Grade " + i + "?");
			Scanner Grade = new Scanner(System.in);
			int grade = Grade.nextInt();
			array[i] = grade;
		}
		
		
		
		Grades myGrades = new Grades(array, array.length);
		myGrades.orderArray();
		System.out.println(myGrades);
		
	}
}