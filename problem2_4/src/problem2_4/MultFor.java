package problem2_4;

import java.util.Scanner;

public class MultFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int a = input.nextInt();
		
		for(int i=0 ; i<a ;i++) {
			System.out.printf("i=%2d",i);
			System.out.print("   j=");
			for(int j=0 ; j<=i ;j++) {
				System.out.print(j);
				if(i>j) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		
		for(int i=0 ; i<a+1 ;i++) {
			System.out.printf("i=%2d",i);
			System.out.print("   j=");
			for(int j=a ; j>=i ;j--) {
				System.out.print(Math.abs(j-a));
				if(i<j) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}

}
