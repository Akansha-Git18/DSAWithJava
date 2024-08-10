package pepcoding.basic;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DigitFrequency {

	public static int freq(int num,int digit) {
		int count=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			if(rem==digit) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int digit= sc.nextInt();
		int frequency=freq(number,digit);
		System.out.println("Count of "+digit+" is = "+frequency);
		
	}
}
