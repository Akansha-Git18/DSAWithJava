package pepcoding.basic;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			int j=i;
			while(j>0) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
		}
	}
}
