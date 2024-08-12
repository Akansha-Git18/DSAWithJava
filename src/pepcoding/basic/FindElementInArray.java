package pepcoding.basic;

import java.util.Arrays;
import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array Size");
		int arrSize= sc.nextInt();
		System.out.println("Enter the elements");
		
		int[] findArray= new int[arrSize];
		for (int i = 0; i < findArray.length; i++) {
			findArray[i]=sc.nextInt();
		}

		System.out.println("Enter the value to be found");
		int ele= sc.nextInt();
		
		int result=-1;
		for (int i = 0; i < findArray.length; i++) {
			if(findArray[i]==ele) {
				result= i;
				break;
			}
		}
		System.out.println("Element is at index : "+ result);
	}

}
