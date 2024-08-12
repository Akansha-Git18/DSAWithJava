package pepcoding.basic;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize= sc.nextInt();
		int[] spanArray=new int[arrSize];
		System.out.println("Enter the values of array");
		for (int i = 0; i < arrSize; i++) {
			spanArray[i]=sc.nextInt();
		}
		
		int max=spanArray[0];
		int min= spanArray[1];
		for (int i = 1; i < spanArray.length; i++) {
			if(max<spanArray[i]) {
				max= spanArray[i];
			}
			if(min>spanArray[i]) {
				min= spanArray[i];
			}
		}
		
		System.out.println("Span of Array is : "+(max-min));
	}

}
