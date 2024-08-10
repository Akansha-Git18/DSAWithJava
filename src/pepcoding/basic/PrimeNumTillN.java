package pepcoding.basic;

import java.util.Scanner;

public class PrimeNumTillN {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lower limit. ");
		int lower= sc.nextInt();
		System.out.println("Enter the higher limit. ");
		int higher= sc.nextInt();
		
		for (int i = lower; i <= higher; i++) {
			int count=0;
			for (int j = 2; j < i/2; j++) {
				if(i%j==0) {
					count++;
					break;}
				
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}
}
