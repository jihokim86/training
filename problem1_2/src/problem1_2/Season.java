package problem1_2;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
//월을 1~12 정수값으로 읽어서 해당하는 계절을 표시하는 프로그램
		Scanner input = new Scanner(System.in);
		System.out.println("몇 월입니까?");
		int a=input.nextInt();
		
		switch(a) {
		case 1:
		System.out.println("봄");break;
		case 2:
		System.out.println("봄");break;
		case 3:
		System.out.println("봄");break;
		case 4:
		System.out.println("여름");break;
		case 5:
		System.out.println("여름");break;
		case 6:
		System.out.println("여름");break;
		case 7:
		System.out.println("가을");break;
		case 8:
		System.out.println("가을");break;
		case 9:
		System.out.println("가을");break;
		case 10:
		System.out.println("겨울");break;
		case 11:
		System.out.println("겨울");break;
		case 12:
		System.out.println("겨울");break;
		default:
		System.out.println("그런 월은 없습니다.");break;
		}
		input.close();
	}

}
