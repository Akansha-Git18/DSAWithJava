package pepcoding.basic;

import java.util.Scanner;

public class AnybaseToAnybase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int numBase= sc.nextInt();
		int toBase=sc.nextInt();
		
		int result= toAnyBase(number, numBase, toBase);
		System.out.println(result);
		
	}
	
	public static int toAnyBase(int number,int numBase,int toBase) {
		int dec= Todecimal(number, numBase);
		int anyBase=convertBase(dec, toBase);
		
		return anyBase;
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
