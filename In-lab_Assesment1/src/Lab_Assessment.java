import java.util.Arrays;

public class Lab_Assessment {
	
	

	public static void main(String args[]){
		
		System.out.println(isGoofy(12));
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(26));
		System.out.println(isGoofy(8));
		System.out.println(isGoofy(1234));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(3)));
		System.out.println(getSomeGoofyNumbers(15));
		
	}
	
	public static boolean isGoofy(int num) {
		
		int sum = 0;
		String str = "" + num;
		for(int i = 0; i<str.length(); i++){
			int character = Character.getNumericValue(str.charAt(i));
			if(num%character == 0){
				sum += character;
			}
		}
		if(sum%2 ==0){
			return false;
		}
		else{
			return true;
		}
	}

public static int[] getSomeGoofyNumbers(int count){
	int number = 1;
	int counter = 0;
	int[] goofyNumbers = new int[count];
	while (goofyNumbers[count-1] == 0){
		if(isGoofy(number)){
			goofyNumbers[counter] = number;
			counter++;
		}
		number++;
	}
	return goofyNumbers;
}
	
}
