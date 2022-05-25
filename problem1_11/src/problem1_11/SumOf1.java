package problem1_11;

import java.util.Scanner;

public class SumOf1 {
	
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0 ; i<a.length;i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		//배열 a이 가진 모든 요소의 합을 구하는 sumOf()매소드를 작성
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수:");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i=0 ; i<a.length ; i++) {
			System.out.print("x["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("모든 요소의 합은"+sumOf(a)+ "입니다.");
	}

}
