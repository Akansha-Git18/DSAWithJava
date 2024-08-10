package pepcoding.basic;

import java.util.Scanner;

public class AnyBaseSubtraction {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first num");
		int firstNum= sc.nextInt();
		System.out.println("Enter second num");
		int secondNum= sc.nextInt();
		System.out.println("Enter base");
		int base= sc.nextInt();


		int result= subtraction(firstNum, secondNum, base);
		System.out.println(result);
	}

	public static int subtraction(int firstNum,int secondNum,int base) {
		int difference =0;
		int subValue=0;

		int power=1;
		
		while(firstNum>0 || secondNum>0 ) {
			int rem1= firstNum%10;
			int rem2= secondNum%10;
			rem2-=difference;
			if(rem2<rem1) {
				difference=1;
				rem2+=base;
			}
			int res= rem2-rem1;

			subValue+= res*power;
			power*=10;


			firstNum=firstNum/10;
			secondNum=secondNum/10;

		}
//		addedValue+=carry*(Math.pow(10, power));
		return subValue;
	}
}
