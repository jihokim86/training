package problem1_3;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
//문제[4-5]에서 x-- 를 --x로 고치면 출력이 바뀌는 지 검증
		
	Scanner input = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시면 0까지 카운트다운 합니다.");
		
		int x;
		do {
			System.out.println("양의 정수값");
			x=input.nextInt();
		}while(x<=0);
		
		while(x>=0) {
			System.out.println(--x);
			System.out.println("x의 값이"+x+"이 됐습니다.");
		}
	input.close();
	}

}
