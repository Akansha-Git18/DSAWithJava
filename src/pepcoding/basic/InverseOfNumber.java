package pepcoding.basic;

import java.util.Scanner;

public class InverseOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=1;
		int inversenum=0;
		int temp=number;
//		while(number>0) {
//			number=number/10;                      //456/10= 45
//			count++;								//45/10=4
//											//4/10=0
//		}
		
		while(temp>0) {
			int rem= temp%10;		//2413%10= 3
			temp=temp/10;			//2413/10=241
			inversenum+=(int) (count*(Math.pow(10, rem-1)));
			count++;
			
		}
		System.out.println(inversenum);	
	}
}
