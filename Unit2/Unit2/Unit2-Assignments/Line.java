//© A+ Computer Science  -  www.apluscompsci.com
//Name - Jason Lin
//Date - 2/5/18
//Class - Period 2
//Lab  - Lab 02F

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{

	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope( )
	{

		slope = ((double)yTwo - (double)yOne)/((double)xTwo - (double)xOne);

	}

	public void print( )
	{

		System.out.printf("the slope is " + "%.3f", slope);

	}
}