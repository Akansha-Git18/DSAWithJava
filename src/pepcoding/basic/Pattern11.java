package pepcoding.basic;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int num=1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(num+"\t");
				num++;
			}
			System.out.println();
		}
	}
}
