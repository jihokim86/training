package problem1_3;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
	// 읽은 정수 값의 부호를 판정해서 표시(원하는 만큼 반복)
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하시면 부호를 판정합니다.");
			int a = input.nextInt();
			if(a>0) {
				System.out.println("입력한 값은 양수 입니다.");
				}else if(a<0) {
				System.out.println("입력한 값은 음수 입니다.");
			    }else {
			    System.out.println("0을 입력하셨습니다.");
                }
			System.out.println();
			System.out.println("계속 진행하려면 1, 그만두려면 0을 입력하세요");
			int b = input.nextInt();
			if(b==0) {
				break;
			}
		}
		input.close();
    }
}

