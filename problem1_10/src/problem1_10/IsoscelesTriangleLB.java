package problem1_10;

import java.util.Scanner;

public class IsoscelesTriangleLB {
	//문자 c를 n개를 표시하는 메소드 putChar
	static void putChar(char c,int n) {
		while(n-- > 0) {
			System.out.print(c);
		}
	}
	
//	static void putStar(int n) {
//		putChar();
//	}

	public static void main(String[] args) {
		//문자 c를 n개를 표시하는 putChar 매소드와 이 매소드를 내부에서 호출해서
		// 문자 * 를 n개 연속으로 표시하는 putStar매소드를 작성
		//이 매소드를 이용해서 직각삼각형을 만들어라.
		Scanner input = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는:");
		int n = input.nextInt();
		for(int i =1 ; i <=1+(n-1) ; i++) {
			for (int j = 0; j < i; j++) {
				putChar('*',n);
			}
			System.out.println();
		}
		
	}
}
