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

public class GradeBookFileRunner
{
	public static void main( String args[] ) throws IOException
	{
		out.println("Welcome to the Class Stats program!");
		Scanner data = new Scanner(new File("gradebook.dat"));
		String className = data.nextLine();
		int numStudents = data.nextInt();
		data.nextLine();
		Class myClass = new Class(className, numStudents);
		for(int i = 0; i<numStudents; i++){
			String name = data.nextLine();
//				System.out.println(name);
			String grades = data.nextLine();
//				System.out.println(grades);
			myClass.addStudent(i, new Student(name, grades));
		}
		System.out.println(myClass + "\n\n");
		
		
		for(int i=0; i<numStudents; i++){
			for(int j = i; j<numStudents; j++){
				if(myClass.getStudentAverage(i) > myClass.getStudentAverage(j)){
					Student holder = myClass.getStudent(i);
					myClass.setStudent(i, myClass.getStudent(j));
					myClass.setStudent(j, holder);
				}
			}
		}
		System.out.println(myClass);
		
		
		System.out.println("Failure List = " + myClass.getFailureList(70));	
		System.out.println("Highest Average = " + myClass.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + myClass.getStudentWithLowestAverage());
		out.println(String.format("Class Average = " + myClass.getClassAverage()));
		
		
	}		
}