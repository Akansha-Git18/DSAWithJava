package pepcoding.basic;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int space=0;
		for (int i = 1; i <=rows; i++) {
			for (int j = 0; j <space; j++) {
				System.out.print("\t");
			}
			space++;
			System.out.print("*\t");
			System.out.println();
		}
	}
}
