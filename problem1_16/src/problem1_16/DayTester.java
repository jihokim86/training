package problem1_16;

import java.util.Scanner;

public class DayTester {
	static Scanner stdIn = new Scanner(System.in);
	
	//--날짜 관련 정보 표시 
	
	static void display(Day day) {
		System.out.println(day+"에 관한 정보"); // ok
		System.out.println("윤년"+(day.isLeap() ? "입니다" : "이 아닙니다")); //ok
		System.out.println("연도 내 경과 일수:"+day.dayOfYear());
//		System.out.println("연도 내 잔여 일수:"+day.leftDayOfYear());
	}
	
	//--날짜 변경
	static void change(Day day) {
		System.out.println("[1]연월을 변경 [2]연을 변경");
		System.out.println("[3]월을 변경 [4]일을 변경");
		System.out.println("[5]1일 뒤 [6]1일 앞");
		System.out.println("[7]n일 뒤 [8]n일 앞");
	}
	
	public static void main(String[] args) {
		System.out.println("날짜를 입력하세요");
		System.out.print("연 : "); int y = stdIn.nextInt();
		System.out.print("월 : "); int m = stdIn.nextInt();
		System.out.print("일 : "); int d = stdIn.nextInt();
		
		Day day = new Day(y,m,d);
		
		while(true) {
			System.out.print("[1]날짜 관련 정보 표시 [2]날짜 변경	[3]다른 날짜와 비교\n"+"[4]전후 날짜 [5]종료:");
		
			int menu = stdIn.nextInt();
			if(menu ==5) break;
			
			switch(menu) {
			case 1 : display(day); break;
//			case 2 : change(day); break;
//			case 3 : compare(day); break;
//			case 4 : beforeAfter(day); break;
			}
		
		}
	}
	
}
