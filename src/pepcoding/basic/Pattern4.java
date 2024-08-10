package pepcoding.basic;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int star=num;
		int space=0;
		for (int i = 1; i <=num ; i++) {
			for (int j = 0; j <space; j++) {
				System.out.print("\t");
			}
			for (int j = star; j >0; j--) {
				System.out.print("*\t");
			}
			
			System.out.println();
			star--;
			space++;
		}
	}
}
