package Week.day2;

public class ReverseCharacter {
	public static void main(String[] args) {
		String input = "de12ef35777777yu";
		String reverse ="";
		String Final ="";
		int j=0;
		// convert the string into Char array
		char alpha[] =input.toCharArray();
		
		
		//System.out.println(alpha[0]);
		for(int i=alpha.length-1;i>=0;i--)
		{
			
			if (Character.isAlphabetic(alpha[i]))
			{
				reverse = reverse + alpha[i];
			}
			System.out.println(reverse);
		}
		System.out.println(reverse);
	}

}
