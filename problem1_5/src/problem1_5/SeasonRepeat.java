package problem1_5;

import java.util.Scanner;

public class SeasonRepeat {

	public static void main(String[] args) {
		// 달을 정수값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램을 작성
		// 원하는 만큼 입력 및 출력할수있게하며, 1~12이외의 값이 입력된 경우 재입력
		// 이중 do문
		Scanner input = new Scanner(System.in);
			System.out.println("계절을 찾습니다.");
		int a,b;
		
		do {
			do {
			System.out.println("몇 월입니까?:");
			a= input.nextInt();
			}while(a<=0 || a>12);
			
			if(a>=3 && a<=5) {
				System.out.println("봄");
			}
			if(a>=6 && a<=8) {
				System.out.println("여름");
			}
			if(a>=9 && a<=11) {
				System.out.println("가을");
			}
			if(a==1 || a==2 || a==12) {
				System.out.println("겨울");
			}
			
			System.out.println("다시 하겠습니까? 1.Yes / 0.NO");
			 b = input.nextInt();
		}while(b==1);
		System.out.println("종료");
		input.close();
	}
}
