//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter myCounter = new AtCounter();
		//test the code
		myCounter.countAts(0, 0);
		out.println(myCounter);
		
		myCounter = new AtCounter();
		myCounter.countAts(2, 5);
		out.println(myCounter);
		
		myCounter = new AtCounter();
		myCounter.countAts(5, 0);
		out.println(myCounter);
		
		myCounter = new AtCounter();
		myCounter.countAts(9, 9);
		out.println(myCounter);
		
		myCounter = new AtCounter();
		myCounter.countAts(3, 9);
		out.println(myCounter);
		
	}
}