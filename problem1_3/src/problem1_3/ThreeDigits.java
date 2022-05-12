package problem1_3;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
//3자리의 양의 정수값(100~999)를 읽는 프로그램을 작성해라
// 입력한 값이 3자리 양의 정수가 아니면다시 입력하게 해라
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.println("3자리 양의 정수 값을 입력하세요");
		
		int num= input.nextInt();
		
		if(num>=100 && num<1000) {
			System.out.println("입력한 값은 "+num+"으로 세자리 양의정수 입니다.");
			System.out.println("프로그램을 종료합니다!!");
			break;
		}else {
			System.out.println("세자리의 양의정수가 아닙니다.");
			System.out.println();
		}
      }
		input.close();
	}
}

