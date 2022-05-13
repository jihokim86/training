package problem1_5;

import java.util.Scanner;

public class IsoscelesTriangleLB {

	public static void main(String[] args) {
		//기호 문자 * 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성
		//직각의 위치가 왼쪽아래,왼쪽위,오른쪽아래,오른쪽위에 표시
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		do {
			System.out.print("단수는?:");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=1; i<=a ; i++) {
			for(int j=0; j<i ; j++) {
			System.out.print("*");
		  }
			System.out.println();
		}
		input.close();
	}
}
