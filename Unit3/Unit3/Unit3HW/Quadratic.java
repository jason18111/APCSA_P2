//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
		
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{

		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		
 	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.pow(b*b - 4*a*c, 0.5)) / (2*a);
		rootTwo = (-b - Math.pow(b*b - 4*a*c, 0.5)) / (2*a);
	}

	public void print( )
	{
		System.out.println("Enter a :: " + a);
		System.out.println("Enter b :: " + b);
		System.out.println("Enter c :: " + c);
		System.out.println(" ");
		System.out.println("root one :: " + rootOne);
		System.out.println("root two :: " + rootTwo);
		
		
	}
}