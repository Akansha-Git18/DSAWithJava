package pepcoding.basic;

import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array Size");
		int arrSize= sc.nextInt();
		System.out.println("Enter the elements");
		
		int[] barArray= new int[arrSize];
		for (int i = 0; i < barArray.length; i++) {
			barArray[i]=sc.nextInt();
		}
		
		int max= barArray[0];
		for (int i = 1; i < barArray.length; i++) {
			if(barArray[i]>max) {
				max= barArray[i];
			}
		}
		int temp=max;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < barArray.length; j++) {
				if(barArray[j]<temp) {
					System.out.print("\t");
				}
				else {
				System.out.print("*\t");
				}
				
			}
			temp--;
			System.out.println();
		}
		
	}
}
