package Week.day2;

import java.util.Arrays;

public class Mymissingnumber {
	public static void main(String[] args) {
		//int[] num = {1,2,3,5,4,6,8,9,};
		int[] num = {1,3,6,2,4,5,8,9};
		Arrays.sort(num);
		int numlength = num.length;
		System.out.println(numlength);
		for (int i=1;i<=numlength;)
		{
			int c= num[i-1];
			//System.out.println(c);
			if (c!=i)
				System.out.println("Missing Array Number = "+i);
			break;
		}
}
}
	
	
	
	
	
	