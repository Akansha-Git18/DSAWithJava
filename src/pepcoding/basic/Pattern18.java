package pepcoding.basic;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int rows= sc.nextInt();
		int os=0;
		int star=rows;
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <=os; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <=star; j++) {
				if(i>1 && i<=rows/2 && j>1 && j<star) {
				System.out.print("\t");}
				else {
					System.out.print("*\t");
				}
			}
			if(i<rows/2+1) {
				os++;
				star-=2;
			}
			
			else {
				os--;
				star+=2;
			}
			System.out.println();
		}
	}
}
