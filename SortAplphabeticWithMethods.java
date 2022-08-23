package assignment3;

import java.util.Arrays;

public class SortAplphabeticWithMethods {

	public static void main(String[] args) 
	{
		
		String str = "cba";// declare string 
		char[] cArray = str.toCharArray();// convert string  into char  array
	
		Arrays.sort(cArray);// sort the array
		String str2 = new String(cArray);
		System.out.println(new String(str2));//
		
				

	}

}
