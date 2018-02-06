//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jason Lin
//Date - 2/5/18
//Class - Period 2
//Lab  - lab02e

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = Math.PI * java.lang.Math.pow(radius, 2);
	}

	public void print( )
	{
		System.out.println("The area is :: " + area );
	}
}