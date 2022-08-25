package collections;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> dup = new TreeSet<Integer>();
		for (int i=0;i< data.length;i++)
			if(dup.contains(data[i])) {
				System.out.println("Duplicate number " +data[i] +" will not be re-added to Set");
			}
			else {
				dup.add(data[i]);
		
	}
	System.out.println(dup);
	}

}

