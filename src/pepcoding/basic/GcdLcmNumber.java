package pepcoding.basic;

import java.util.Scanner;

public class GcdLcmNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNum= sc.nextInt();
		System.out.println("Enter second number");
		int secondNum=sc.nextInt();
		int on1=firstNum;
	int on2=secondNum;
//		int GCD= 1;
//		for (int i = 2; i < firstNum/2; i++) {
//			if(firstNum%i==0 && secondNum%i==0) {
//				GCD=i;
//			}
//		}
		
		while(firstNum%secondNum!=0) {
			int rem= firstNum%secondNum;
			firstNum=secondNum;
			secondNum=rem;
		}
		int GCD= secondNum;
		System.out.println(GCD);
		int LCM= (on1*on2)/GCD;
		System.out.println(LCM);
	}
}
