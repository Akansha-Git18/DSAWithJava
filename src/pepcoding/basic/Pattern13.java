package pepcoding.basic;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] arsg) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int num=0;
		for (int i = 0; i <rows; i++) {
			int icj=1;
			for (int j = 0; j <=i; j++) {
				System.out.print(icj+"\t");
				int icjp1= icj *(i-j)/ (j+1);
				icj=icjp1;
			}
			System.out.println();
		}	
	}
}
