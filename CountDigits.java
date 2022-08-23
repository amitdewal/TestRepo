package assignment3;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		int i ,n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		n = sc.nextInt();
		while (n!=0) 
		{
			count++;
			n=n/10;
		}
		System.out.println(count);

	}

}
