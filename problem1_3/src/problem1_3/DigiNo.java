package problem1_3;

import java.util.Scanner;

public class DigiNo {

	public static void main(String[] args) {
//양의 정수값을 읽어서 그 자리수를 출력하는 프로그램을 작성.
		
		Scanner input = new Scanner(System.in);
		int a;
		do {
		System.out.println("양의 정수값을 입력하세요");
		a= input.nextInt();
		}while(a<=0);
		
		int digit=0;
		
		while(a>0) {
			digit++;
			a =a/10;
		}
		System.out.println("입력한 숫자는"+digit+"자리입니다.");
		input.close();
	}
}
