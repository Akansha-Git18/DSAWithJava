package pepcoding.basic;

import java.util.Scanner;

public class AnyBaseAddition {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first num");
		int firstNum= sc.nextInt();
		System.out.println("Enter second num");
		int secondNum= sc.nextInt();
		System.out.println("Enter base");
		int base= sc.nextInt();


		int result= addition(firstNum, secondNum, base);
		System.out.println(result);
	}

	public static int addition(int firstNum,int secondNum,int base) {
		int carry =0;
		int addedValue=0;

		int power=0;
		while(firstNum>0 || secondNum>0 || carry>0) {
			int rem1= firstNum%10;
			int rem2= secondNum%10;
			int sum= rem1+rem2+carry;

			int resRem=sum%base;
			int div= sum/base;
			carry=div;
			addedValue+=resRem*(Math.pow(10, power));
			power++;


			firstNum=firstNum/10;
			secondNum=secondNum/10;

		}
//		addedValue+=carry*(Math.pow(10, power));
		return addedValue;
	}
}
