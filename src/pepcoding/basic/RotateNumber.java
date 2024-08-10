package pepcoding.basic;

import java.util.Scanner;

public class RotateNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to rotate.");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("Enter the rotation number");
		int rotate= sc.nextInt();
		int temp=num;
		int count=0;
		while(temp>0) {
			temp=temp/10;                      
			count++;								

		}
		
		rotate= rotate%count;
		if(rotate<0) {
			rotate= rotate+count;
		}
		int div=1;
		int mul=1;
		for (int i = 1; i <=count; i++) {
			if(i<=rotate) {
				div= div*10;
			}
			else{mul=mul*10;}
		}
		
		int q= num/div;
		int rem= num%div;
		
		int reverseNum= rem*mul+q;
		System.out.println(reverseNum);
	}
}
