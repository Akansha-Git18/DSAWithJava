package pepcoding.basic;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows= sc.nextInt();
		int space=rows/2;
		int star=1;

		int num=1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print(num+"\t");
				if(j<=star/2) {
					num++;
				}
				else
				
				{
					num--;
				}
			}
			System.out.println();
			num+=2;
			if(i<=rows/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
				num-=2;
			}
		}
	}
}
