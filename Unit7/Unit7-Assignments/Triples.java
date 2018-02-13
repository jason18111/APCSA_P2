//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;


public class Triples
{
	
   private int number;

	public Triples()
	{
		number = 0;
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i=1; i<=number; i++){
			if(a%i==0 && b%i==0 && c%i==0){
				max = i;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		int a;
		int b;
		int c;

		for (int i=1; i<=number; i++){
			a=i;
			for (int j=i; j<=number; j++){
				b =j;
				for (int k=j; k<=number; k++){
					c=k;
					if(a*a+b*b==c*c && (a%2==1 && b%2==0||a%2==0 &&b%2==1) && c%2==1 && greatestCommonFactor(a,b,c)==1){
						output += a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		return output;
	}
}