package problem1_9;

import java.util.Scanner;

public class Med3 {
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else {
				return c;
			}
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else {
			return b;
		}
	}

	public static void main(String[] args) {
		//3개의  int형 인수 a,b,c에서 중간값을 구하는 med메소드를 작성.
		//int med(int a, int b, int c)
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 a:"); int a = input.nextInt();
		System.out.println("정수 b:"); int b = input.nextInt();
		System.out.println("정수 c:"); int c = input.nextInt();
		
		System.out.println("중간값은"+med3(a,b,c)+ "입니다.");
		input.close();
	}
}
