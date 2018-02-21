//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int max = 0;
		for (int i = 0; i<roman.length(); i++){
			for (int j = 0; j<LETTERS.length; j++){
				if((i+1)<roman.length() && roman.substring(i, i+2) == LETTERS[j]){
					 max=j;
					 
					 i++;
				}
				else if(Character.toString(roman.charAt(i)) == LETTERS[j] && LETTERS[max].length()==1){
					max=j;
				}
				else{
					max=-1;
				}
			}
			if(max != -1){
				number += NUMBERS[max];
			}
		}
		return number;
	}
		


	public String getRoman(){
		
		
		
		return roman;
	}
	
	public String toString()
	{
		return getNumber() + " ";
	}
}