package pepcoding.basic;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if(i==j || i+j==rows+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
