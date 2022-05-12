package problem1_3;

import java.util.Scanner;

public class Numver2digits {

	public static void main(String[] args) {
//2자리의 정수 값(10~99)를 맞추는 숫자맞추기게임을 만들자.
//난수 생성과 if문 그리고 do문을 사용할 것.
		
		Scanner input = new Scanner(System.in);
		
		int num = (int)(Math.random()*99)+10;
		int num1;
		System.out.println(num);
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 입력하세요");
		
		do {
			num1 = input.nextInt();
			if(num1>num) {
				System.out.println("더 작은 숫자입니다.");
			}else if(num1<num) {
				System.out.println("더 큰 숫자입니다");
			}else
				System.out.println("정답입니다.");
		}while(num != num1);
		input.close();
	}

}
