package pepcoding.basic;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int temp=num;
		for (int div = 2; div < num/2; div++) {
			while(num%div==0) {
				num=num/div;
				System.out.println(div);
			}
		}
		if(num>1) {
			System.out.println(num);
		}
		//15  -> 15/3= 5
		
	}
}
