package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<data.length; i++) {
			set.add(data[i]);
			System.out.println(set);
		}
		System.out.println(set.contains(11));
		List<Integer> secondLast = new ArrayList<Integer>(set);
		System.out.println(secondLast.get(secondLast.size()-2));
		
		
	}

}
