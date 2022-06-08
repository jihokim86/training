package problem2_2;

import java.util.Scanner;

public class YearEvenOddLeap {

	public static void main(String[] args) {
		// int year = 2004 처럼 년도를 설정하면 홀/짝/윤년을 구별
		
		Scanner input = new Scanner(System.in);
		System.out.println("=== 입력 년도의 홀/짝/윤년 판별 ===");
		System.out.print("년도를 입력하세요 : ");
		int year = input.nextInt();
		int a = year%2; //0 or 0이 아닌 수
		int b = year%4; //0 or 0이 아닌 수
		
		if(a*b==0) {
			System.out.println("입력한 년도는 짝수년이면서 윤년입니다.");
		}else if(a==0) {
			System.out.println("입력한 년도는 짝수년이면서 윤년이 아닙니다.");
		}else {
			System.out.println("입력한 년도는 홀수년이면서 윤년이 아닙니다.");
		}
		input.close();
	}
}
