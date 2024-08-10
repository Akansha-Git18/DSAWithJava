package pepcoding.basic;

import java.util.Scanner;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first num");
		int fNum= sc.nextInt();
		System.out.println("Enter the second num");
		int sNum= sc.nextInt();
		System.out.println("Enter the third num");
		int tNum= sc.nextInt();
		
		if(fNum>sNum && fNum>tNum) {
			boolean flag=(fNum*fNum)== (sNum*sNum)+(tNum*tNum) ;
			
				System.out.println(flag);
			
		}
		else if(sNum>fNum && sNum>tNum) {
			boolean flag=(sNum*sNum)== (fNum*fNum)+(tNum*tNum);
				System.out.println(flag);
		}
		else {
			boolean flag=(tNum*tNum)== (sNum*sNum)+(fNum*fNum);
				System.out.println(flag);
		}
}
}
