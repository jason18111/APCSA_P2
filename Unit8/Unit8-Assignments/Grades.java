//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	
	double[] array;
	int length;

	//constructor

	public Grades(double [] arr, int len){
		setArray(arr, len);
	}

	//set method
	public void setArray(double[] arr, int len){
		array = arr;
		length = len;
	}


	private double getSum()
	{
		double sum=0.0;
		
		for (int i = 0; i<array.length; i++){
			sum += array[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;

		average = getSum()/(double)length;

		return average;
	}
	
	public void orderArray(){
		for (int i = 0; i < array.length; i++){
			for (int j=i; j< array.length; j++){
				if(array[i] > array[j]){
					double holder = array[i];
					array[i]=array[j];
					array[j]=holder;
				}
			}
		}
		
	}


	//toString method
	public String toString(){
		String output = "";
		
		for (int i = 0; i < length; i++){
			output += "grade " + i + " :: " + String.format("%.2f", array[i]) + "\n";
		}
		
		output += "\n" + "average = " + String.format("%.2f", getAverage());
		
		return output;
		
	}
	


}