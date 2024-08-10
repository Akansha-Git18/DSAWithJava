package pepcoding.basic;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int space= rows-1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			space--;
			System.out.println();
		}
	}
}
