package pepcoding.basic;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int os=rows/2;
		int is=-1;
		for (int i = 1; i <= rows; i++) {
//			System.out.println(os+" , "+is);

			for (int j = 1; j <= os; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for (int j = 1; j <= is; j++) {
				System.out.print("\t");
			}
			if(i!=1 && i!= rows) {
			System.out.print("*\t");}
			System.out.println();
			if(i<=rows/2){
				os--;
				is+=2;
			}
			else {
				os++;
				is-=2;
			}
		}
	}
}
