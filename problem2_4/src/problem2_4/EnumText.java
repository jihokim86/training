package problem2_4;

import java.util.Scanner;

public class EnumText {

	public static void main(String[] args) {
		//Enum 파일을 활용한 출력
		
		Season season = null; //열거타입 변수 선언 (열거타입 변수)
		// (열거타입+변수 = 열거타입.열거상수)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하면 계절을 알려주도록하지!:");
		int key = input.nextInt();
		
		switch (key) {
		case 3:case 4:case 5:
			System.out.println(Season.Spring);
			break;
		case 6:case 7:case 8:
			System.out.println(Season.Summer);
			break;
		case 9:case 10:case 11:
			System.out.println(Season.autumn);
			break;
		case 12:case 1:case 2:
		System.out.println(Season.winter);
		break;
		
		default:
			break;
		}
	}

}
