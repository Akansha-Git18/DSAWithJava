package pepcoding.basic;

import java.util.Scanner;

public class AnybaseToDecimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int numBase= sc.nextInt();
		
		int decimalval= Todecimal(number, numBase);
		System.out.println(decimalval);
		
	}
	
	public static int Todecimal(int number,int numBase) {
		int  decimalval=0;
		int power=0;
		while(number>0) {
			int rem= number%10;
			number= number/10;
			decimalval+=rem*(Math.pow(numBase, power));
			power++;
		}
		
		return decimalval;
	}
}
