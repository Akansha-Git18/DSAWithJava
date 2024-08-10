package pepcoding.basic;

import java.util.Scanner;

public class DecimalToAnyBase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int decimalNum=sc.nextInt();
		int base= sc.nextInt();
		int convertedNum= convertBase(decimalNum, base);
		System.out.println(convertedNum);
		
	}
	
	public static int convertBase(int number,int base) {
		int convertednum=0;
		int power=0;
		while(number>0) {
			int rem=number%base;
			number=number/base;
			convertednum+=rem*(Math.pow(10, power));
			power++;
		}
		
		return convertednum;
	}
}
