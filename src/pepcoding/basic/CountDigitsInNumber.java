package pepcoding.basic;

import java.util.Scanner;

public class CountDigitsInNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Eneter the digit");
		int number= sc.nextInt();
		
		int temp=number;
		int count=0;
		while(temp>0) {
			temp=temp/10;
			count++;
			
		}
		System.out.println(count);
	}
}
