package problem1_20;

import java.util.Scanner;

public class PrintDouble {
	
	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df",w,p),x);
	}
	//

	public static void main(String[] args) {
		// 부동소수점 값 x에서 소수점 이하 부분 p자리로, 그리고 전체를 적어도 w자리로
		//표시하는 매소르를 작성하자.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("실수 값:");
		Double x = stdIn.nextDouble();
		
		System.out.print("전체자리수:");
		int w = stdIn.nextInt();
		
		System.out.print("소수점 자리수:");
		int p = stdIn.nextInt();
		
		printDouble(x,p,w);
		System.out.println();
	}
}
