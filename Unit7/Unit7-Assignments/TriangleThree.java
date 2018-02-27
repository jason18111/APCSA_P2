//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0 ;
		letter = "";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for (int i = 1; i<=size; i++){
			for (int i2 = 1; i2<=size-i; i2++){
				output += " ";
			}
			for (int i3=size-i+1; i3 <= size; i3++){
				output += getLetter();
			}
			output += "\n";
		}
			
		return output;
	}
		
}
