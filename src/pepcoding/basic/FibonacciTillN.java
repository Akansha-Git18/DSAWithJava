package pepcoding.basic;

import java.util.Scanner;

public class FibonacciTillN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number till where we want fibonacci series.");
		int num= sc.nextInt();
		int i=0;
		int first=0;
		int second=1;
		while(i<num) {
			System.out.println(first);
			int sum=first+second;
			first=second;
			second= sum;
			i++;
		}
	}
}
