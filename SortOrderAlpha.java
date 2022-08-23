package assignment3;

import java.util.Arrays;

public class SortOrderAlpha {

	public static void main(String[] args) {
		String str = "zyxwvutsrqponmlkjihgfedcba";
		 int temp;
		
		char[] cArray = str.toCharArray();
		
		for (int i = 0; i < cArray.length-1; i++) 
		{
			
			for (int j = 0; j < cArray.length-1; j++) 
			{
				
				if(cArray[j]>cArray[j+1])
					
				{
					temp = cArray[j];
					cArray[j]=cArray[j+1];
					cArray[j+1]=(char) temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(cArray));
		
	}

}
