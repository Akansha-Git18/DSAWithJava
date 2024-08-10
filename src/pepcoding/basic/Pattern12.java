package pepcoding.basic;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows= sc.nextInt();
		int first=0;
		int second=1;

		for (int i = 1; i <=rows; i++) {
			for (int j = 1; j <=i; j++) {
				int temp=j;
				System.out.print(first+"\t");
				int sum= first+second;
				first = second;
				second=sum;
			}
			System.out.println();
		}

	}
}
