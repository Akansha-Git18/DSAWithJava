package pepcoding.basic;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		for (int i = rows; i >0; i--) {
			int j=i;
			while(j>0) {
				System.out.print("*\t");
				j--;
			}
			System.out.println();
		}
	}
}
