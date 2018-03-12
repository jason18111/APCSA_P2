//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		Grades gradesGetter = new Grades(gradeList);
		myGrades = gradesGetter;
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/(double)getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (getSum()-getLowGrade())/(double)(getNumGrades() - 1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
/*	public int compareTo(Student param){
		if(getAverage()>param.getAverage()){
			return 1;
		}
		else if(getAverage()<param.getAverage()){
			return -1;
		}
		return 0;
	}
*/
	
	public String toString()
	{
		String output = myName + " = " + myGrades.toString(); 
		return output;
	}	
}