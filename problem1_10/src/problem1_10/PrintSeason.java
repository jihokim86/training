package problem1_10;

import java.util.Scanner;

public class PrintSeason{
	static void printSeason(int m) {
	
	switch(m) {
	case 3:
	case 4:
	case 5:
		System.out.print("봄");
		break;
	case 6:
	case 7:
	case 8:
		System.out.print("여름");
		break;
	case 9:
	case 10:
	case 11:
		System.out.print("여름");
		break;
	case 12:
	case 1:
	case 2:
		System.out.print("겨울");
		break;
	}
}
	

	public static void main(String[] args) {
		//인수 m에 지정한 달의 계절을 표시하는 printSeason 매서드를 작성
		// m값에 따라 봄(3,4,5) 여름(6,7,8) 가을(9,10,11) 겨울(12,1,2)
		// 그 이외의 값이 오며 아무것도 표시하지 않는다.
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("몇월 입니까(1~12):");
			month = input.nextInt();
		}while(month <1 && month >12);
		
		System.out.print("해당 월의 계절은 ");
		printSeason(month);
		System.out.println("입니다.");
	}

}
