package pepcoding.basic;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		
		int star=1;
		for (int i = 1; i <= rows; i++) {
			int space=rows/2;
			
			for (int j = 1; j <= space; j++) {
				if(i==rows/2+1) {
					System.out.print("*\t");
				}
				else {
				System.out.print("\t");}
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			if(i<rows/2+1) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			
		}
	}
}
