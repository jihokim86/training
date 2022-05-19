package problem1_9;

import java.util.Scanner;

public class Min3 {
	static int min(int a, int b, int c) {
		int min=a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		return min;
	}

	public static void main(String[] args) {
		//3개의 int형 인수 a,b,c 중 최소값을 구하는 min 매서드를 작성
		Scanner input = new Scanner(System.in);
		System.out.printf("정수 a:"); int a = input.nextInt();
		System.out.printf("정수 b:"); int b = input.nextInt();
		System.out.printf("정수 b:"); int c = input.nextInt();
		System.out.println("최소 값은"+min(a,b,c)+"입니다");
	}
}
