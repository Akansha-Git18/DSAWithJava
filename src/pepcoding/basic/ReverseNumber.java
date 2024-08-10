package pepcoding.basic;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
		
		while(number>0) {
			int rem=number%10;
			System.out.println(rem);
			number= number/10;
		}
		
		
	}
}
