package Week.day2;

import java.util.Arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		int[] array1={14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len=array1.length;
		int count;
		
		for(int i=0;i<len;i++)
			//arr[0]=14
		{
			count=0;
			 for(int j=i+1;j<len;j++)
				 //arr[1]=12......20
			 {
				 if(array1[i]==array1[j])
					 count=count+1;
			 }
			 if(count>0)
				 System.out.println(array1[i]+"="+count);
		}

	}
}
