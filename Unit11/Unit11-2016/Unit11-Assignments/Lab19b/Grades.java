//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
//	private double[] grades;
	private ArrayList<Double> grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		int counter = 0;
		int size = Integer.parseInt(gradeList.substring(0, 1));
//		grades = new double [size];
		grades = new  ArrayList<Double>();
		for(int i = 0; i<size; i++){
			grades.add((double) 0);
		}
		
		String gradesWithoutSize = gradeList.substring(gradeList.indexOf("-") + 1);
		
		Scanner gradebook = new Scanner (gradesWithoutSize);
		
		while(gradebook.hasNext()){
			double grade = gradebook.nextDouble();
			setGrade(counter, grade);
			counter++;
		}
		
		
	}
	
	public void setGrade(int spot, double grade)
	{
//		grades[spot] = grade;
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(double num : grades){
			sum += num;
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(double nums : grades){
			if(nums<low){
				low = nums;
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(double nums : grades){
			if(nums>high){
				high = nums;
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
//		return grades.length;
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		
/*		for (int i = 0; i<grades.length; i++){
			output = grades[i] + " ";
		}
*/	
		for (int i = 0; i<grades.size(); i++){
			output += grades.get(i) + " ";
		}

		return output;
	}	
}