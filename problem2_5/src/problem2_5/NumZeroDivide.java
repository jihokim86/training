package problem2_5;

import java.util.Scanner;

public class NumZeroDivide {

	public static void main(String[] args) {
		// 숫자를 0으로 나누면 오류 발생
		try {
		Scanner input = new Scanner(System.in);
		System.out.println("두개의 값을 입력하세요");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = a/b;
		
		System.out.println(c);
		}catch (Exception e) {
			System.out.println("0으로 나눌수 없다");
		}
			
		
	}

}
