package pepcoding.basic;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		
		int space= rows/2;
		int star=1;
		for (int i = 1; i <=rows; i++) {
//			System.out.println(space+","+star+","+space);
			for (int j = space; j >0; j--) {
				System.out.print("\t");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			if(i<((rows/2)+1)) {
				space--;
				star=star+2;
			}
			else {
				space++;
				star=star-2;
			}
			
			
		}
	}
}
