package problem1_5;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// 기호문자 * 를 나열해서 n단의 정방형을 표시하는 프로그램을 작성
		
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("정방형을 표시합니다.");
		do {
			System.out.print("단수는 :");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=0; i<a ; i++) {
			for(int j=0; j<a;j++) {
			System.out.print("*");
		}
			System.out.println();
	  }
		input.close();
	}
}
