package Week.day2;

public class SumofDigitsfromString {
	public static void main(String[] args) {
		String text = "Tes12tLe79af65";
		int sum =0;
		
			//regex of \d = digits, so here i am remove the digits below using replaceAll	
		char ch[]= text.replaceAll("\\d", "").toCharArray();
		
		int len = ch.length;
		System.out.println(len+"="+text.replaceAll("\\d", "") );
		//(Character.getNumericValue('t')); -> Getnumericvalue will shoe the Numeric space Value (eg t=29)
		for (int i=0;i<len;i++)
		{
			System.out.println(ch[i] + "=" +Character.getNumericValue(ch[i]));
			sum = sum + Character.getNumericValue(ch[i]);
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
