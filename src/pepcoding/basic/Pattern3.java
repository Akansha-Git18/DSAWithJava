package pepcoding.basic;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <= rows-i; j++) {
				System.out.print("\t");
			}
			for (int k = (rows-i)+1; k <=rows; k++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
}
