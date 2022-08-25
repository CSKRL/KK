package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
 		int[] missingnumber = {1,2,3,4,5,4,3,2,7,8,9,10};
 		
 		//Remove the Duplicates using Set
 		Set<Integer> missing = new TreeSet<Integer>();
 		
 		for(int i=0 ;i< missingnumber.length;i++) {
 			missing.add(missingnumber[i]);
 			System.out.println(missing);
 		}
 		List<Integer> IdentifyMissing = new ArrayList<Integer>(missing);
 		System.out.println("List IdentifyMissing Element" + IdentifyMissing);
 		for(int i=0;i<missingnumber.length;i++) {
 			{
 				
 					if ( ((IdentifyMissing.get(i))+1)!= IdentifyMissing.get(i+1))
 		{
 			  System.out.println("The missing number in the List is "+(IdentifyMissing.get(i)+1));
 			  break;

 			
 		}}
 		}
		
	}

}
