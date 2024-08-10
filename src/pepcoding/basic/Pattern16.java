package pepcoding.basic;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		System.out.println("Enter number of rows. ");
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int space=rows+(rows-3);
		int star=1;
		
		for (int i = 1; i <= rows; i++) {
			int value=1;
			for (int j = 1; j <= star; j++) {
				System.out.print(value+"\t");
				value++;
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
				
			}
			
			space-=2;
			if(i==rows) {
				value--;
				star--;
			}
			for (int j = 1; j <= star; j++) {
				value--;
				System.out.print(value+"\t");
			}
			
			star++;
			
			System.out.println();
		}
	}
}
