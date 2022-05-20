package problem1_10;

import java.util.Scanner;

public class SumUp1 {
	static int sumUp(int a) {
		int sum=0;
		for (int i = 0; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		//1부터 n까지의 정수의 합을 구해서 반환하ㅣ는 매서드를 작성
		Scanner input = new Scanner(System.in);
		System.out.println("1부터 x까지의 합을 구하자.");
		int x;
		do {
		System.out.print("x의 값 :");
		x =input.nextInt();
		}while(x<=0);
		System.out.println("1부터"+ x+"까지의 정수의 합 : "+sumUp(x));
		input.close();
	}
}
