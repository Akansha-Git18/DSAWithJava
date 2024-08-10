package pepcoding.basic;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		
		int count=0;
		int temp=number;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		while(count>0) {
			int div= (int) (number/(Math.pow(10, count-1)));
			System.out.println(div);
			number=(int) (number%(Math.pow(10, count-1)));
			count--;
			
		}
	}
}
