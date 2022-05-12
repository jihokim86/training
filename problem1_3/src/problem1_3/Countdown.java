package problem1_3;

import java.util.Scanner;

public class Countdown {

	public static void main(String[] args) {
//입력받은 정수값부터 0까지 카운트다운하는 프로그램을 작성하라.
//카운트다운 종료 후의 변수값을 확인 할수 있게 할 것.
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시면 0까지 카운트다운 합니다.");
		
		int x;
		do {
			System.out.println("양의 정수값");
			x=input.nextInt();
		}while(x<=0);
		
		while(x>=0) {
			System.out.println(x--);
			System.out.println("x의 값이"+x+"이 됐습니다.");
		}
	input.close();
	}
}
