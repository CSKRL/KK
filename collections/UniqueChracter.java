package collections;

import java.util.HashSet;

public class UniqueChracter {
public static void main(String[] args) {
	String name = "karthikannan";
	
	// Here we have get the String Length.
	char[] chk = new char[name.length()];
	
	for(int i=0;i<name.length();i++)
	{
		chk[i]= name.charAt(i);
	}
	
	//Create Set
	HashSet<Character> set = new HashSet<Character>();
	for(int i=0; i<name.length();i++)
	{
		if (set.contains(chk[i]))
		{
			set.remove(chk[i]);
		}
		else
			set.add(chk[i]);
	}
	System.out.println(set);
	
}
}
