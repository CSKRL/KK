package Week.day2;
import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,8,6,7,4};
		Arrays.sort(arr);
		int length = arr.length;
		//for (int i : arr) {
		System.out.println(length+" ");
			for(int i=1;i<=length;i++)
		{
		 int c=arr[i-1];
		
		 System.out.println(i+"="+c);
		 if(c!=i)
			 
		 {

			 System.out.println("Missing number in Array is  "  +i);
			 break;
			
		 }
	}
	

}
}
