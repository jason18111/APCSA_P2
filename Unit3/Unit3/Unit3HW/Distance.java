//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{

	}

	public Distance(int x1, int y1, int x2, int y2)
	{


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;


	}

	public void calcDistance()
	{

		distance = java.lang.Math.pow(java.lang.Math.pow((double)xTwo - (double)xOne, 2) + java.lang.Math.pow((double)yTwo - (double)yOne, 2), 0.5);

	}

	public void print( )
	{

		System.out.println("Enter X1 :: " + xOne);
		System.out.println("Enter Y1 :: " + yOne);
		System.out.println("Enter X2 :: " + xTwo);
		System.out.println("Enter Y2 :: " + yTwo);
		System.out.println("distance == " + String.format("%.3f", distance));

	}
}