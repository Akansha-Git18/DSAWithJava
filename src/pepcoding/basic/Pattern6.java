package pepcoding.basic;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int rows= sc.nextInt();
		 int space=1;
		 int star= rows/2+1;
		 
		 for (int i = 1; i <=rows; i++) {
//			System.out.println(star+" , "+space+" , "+star);
			for (int j = 1; j <=star; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <=space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("*\t");
			}
			if(i<rows/2+1) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			System.out.println();
		}
	}
}
