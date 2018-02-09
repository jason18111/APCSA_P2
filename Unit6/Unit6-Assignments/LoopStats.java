//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;
	private int counter;

	public LoopStats()
	{
		start = 0;
		stop = 0;
	}

	public LoopStats(int beg, int end)
	{
		setNums(beg, end);
	}

	public void setNums(int beg, int end)
	{
		start = beg;
		stop = end;
	}

	public int getEvenCount()
	{
		int evenCount=0;
		counter = start;
		
		while (counter <= stop){
			
			if (counter%2 == 0){
				evenCount = evenCount + 1;
			}
		counter++;
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		counter = start;
		
		while (counter <= stop){
			
			if (counter%2 == 1){
				oddCount = oddCount + 1;
			}
		counter++;
		}

		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		counter = start;
		
		while(counter <= stop){
				
			total = total + start;
			counter++;
				
		}

		return total;
	}
	
	public String toString()
	{
		return start + " " + stop + "\n" + "total " + getTotal() + "\n" + "even count " + getEvenCount() + "\n" + "odd count " + getOddCount();
		
	}
}