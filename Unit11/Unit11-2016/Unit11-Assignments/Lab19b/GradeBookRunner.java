//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;
import java.io.IOException;


public class GradeBookRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		out.print("\n\nWhat is the name of this class? ");
		String className = keyboard.nextLine();
		out.print("\n\nHow many students are in this class? ");
		int numStudents = keyboard.nextInt();
		keyboard.nextLine();
		
		Class myClass = new Class(className, numStudents);
		
		int counter = 1; 
		do{
			out.println("Enter the name of student " + counter + ":");
			Scanner keyboard2 = new Scanner (System.in);
			String studentName = keyboard2.nextLine();
			out.println("Enter the grades for " + studentName);
			out.println("use the format --> size - grade1 grade2 grade3...");
			Scanner keyboard3 = new Scanner (System.in);
			String grades = keyboard3.nextLine();
			myClass.addStudent(counter - 1, new Student(studentName, grades));
			counter++;
		}while(counter<=numStudents);
		
		System.out.println(myClass);
		System.out.println("Failure List = " + myClass.getFailureList(70));	
		System.out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());
		out.println(String.format("Class Average = " + myClass.getClassAverage()));
		
   }
}