package Week.day2;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] numbers= {22,67,98,34,58,99};
		Arrays.sort(numbers);
		int len = numbers.length;
	System.out.println("Second Largest Number in Array is:" +numbers[len-2]);	
	
		
	}

}



