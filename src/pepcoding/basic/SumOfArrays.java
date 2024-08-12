package pepcoding.basic;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array1 Size");
		int n1= sc.nextInt();
		System.out.println("Enter the elements of array1");
		
		int[] a1= new int[n1];
		for (int i = 0; i < a1.length; i++) {
			a1[i]=sc.nextInt();
		}
		

		System.out.println("Enter the array2 Size");
		int n2= sc.nextInt();
		System.out.println("Enter the elements of array2");
		
		int[] a2= new int[n2];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=sc.nextInt();
		}

		
		
		int[] sumArr= new int[n1>n2? n1 : n2];
		int c=0;
		int sum=0;
		
		int i=a1.length-1;
		int j=a2.length-1;
		int k =sumArr.length-1;
		
		while(k>=0) {
			int d=c;
			
			if(i>=0) {
				d+=a1[i];
			}
			
			if(j>=0) {
				d+=a2[j];
			}
			
			c=d/10;
			d=d%10;
			
			sumArr[k]=d;
			
			i--;
			j--;
			k--;
		}
		
		if(c!=0) {
			System.out.println(c);
		}
		for (int val : sumArr) {
			System.out.println(val);
		}
	}

}
