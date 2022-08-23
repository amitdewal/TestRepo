package assignment3;

public class CountSpcChar {

	public static void main(String[] args) {
		String str ="abcdefghijklmnopqrstuvwxyz@!@$#%^&*()+";
		int countV=0; 
		int countC=0;
		int countSpl=0;
		
		 str = str.toLowerCase();
		 int size = str.length();
		 
		 for (int i = 0; i <size ;i++) 
		 {
			 
			 if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			 {
				 countV++;
			 }
			  
			 
			 else if(  (str.charAt(i)>='a'&&str.charAt(i)<='z'))
			 {
				 countC++;
			 }
			 else 
			 {
				 countSpl++;
			 }
				 
			 
			 
		
			   
			 
		 }
		 System.out.println("vowels are :"+countV);
		 System.out.println("consonant are :"+countC);
		 System.out.println("special character :"+ countSpl);
		 

	}

}
