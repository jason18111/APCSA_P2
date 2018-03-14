//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
//	private Student[] studentList;
	private ArrayList <Student> studentList;
	
	public Class()
	{
		name="";
//		studentList=new Student[0];
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
//		studentList = new Student[stuCount];
		studentList = new ArrayList<Student>();

	}
	
	public Student getStudent(int stuNum){
//		return studentList[stuNum];
		return studentList.get(stuNum);
	}
	
	public void addStudent(int stuNum, Student s)
	{
//		studentList[stuNum] = s;
		studentList.add(stuNum, s);
	}
	
	public void setStudent(int stuNum, Student s){
		studentList.set(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		double sum = 0;
/*		for(int i = 0; i<studentList.length; i++){
			sum += getStudentAverage(i);
		}
*/
		for(int i = 0; i<studentList.size(); i++){
			sum += getStudentAverage(i);
		}
//		classAverage = sum/studentList.length;
		classAverage = sum/studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
//		return studentList[stuNum].getAverage();
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
//		for(int i = 0; i<studentList.length; i++){
		for(int i = 0; i<studentList.size(); i++){
			if(getStudentName(i).equals(stuName)){
				return getStudentAverage(i);
			}
		}
		return 0;
	}
	
	public String getStudentName(int stuNum)
	{
//		return studentList[stuNum].getName();
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
//		Student highAverage = studentList[0];
		Student highAverage = studentList.get(0);
/*		double high = Double.MIN_VALUE;
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i)>high){
				hName = getStudentName(i);
				high = getStudentAverage(i);
			}
		}
*/
/*		for(int i = 1; i<studentList.length; i++){
			if(studentList[i].compareTo(highAverage)>0){
				highAverage = studentList[i];
			}
		}
*/
		for (int i = 1; i<studentList.size(); i++){
			if(studentList.get(i).compareTo(highAverage)>0){
				highAverage = studentList.get(i);
			}
		}
		return highAverage.getName();
	}

	public String getStudentWithLowestAverage()
	{
//		Student lowAverage = studentList[0];
		Student lowAverage = studentList.get(0);
/*		double low = Double.MAX_VALUE;
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i)<low){
				hName = getStudentName(i);
				low = getStudentAverage(i);
			}
		}
*/
/*		for(int i = 1; i<studentList.length; i++){
			if(studentList[i].compareTo(lowAverage)<0){
				lowAverage = studentList[i];
			}
		}
*/
		for(int i = 1; i<studentList.size(); i++){
			if(studentList.get(i).compareTo(lowAverage)<0){
				lowAverage = studentList.get(i);
			}
		}
		return lowAverage.getName();
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
//		for(int i = 0; i<studentList.length; i++){
		for(int i = 0; i<studentList.size(); i++){
			if(getStudentAverage(i) <= failingGrade){
				output += getStudentName(i) + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
/*		for(int i = 0; i<studentList.length; i++){
			output += studentList[i].toString() + "\t" + "\t" + String.format("%.2f", getStudentAverage(i)) + "\n";
		}
*/
		for(int i = 0; i<studentList.size(); i++){
			output += studentList.get(i).toString() + "\t" + "\t" + String.format("%.2f", getStudentAverage(i)) + "\n";
		}
		return output;
	}  	
}