package problem2_1;

import java.util.Scanner;

public class engLowCapNumPrint {

	public static void main(String[] args) {
		// 영어 대문자/소문자를 문자 및 숫자로 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("영어 대/소문자를 입력하세요! : ");
		char chr = input.next().charAt(0); 				//0번째 인덱스의 문자를 읽음
		int num = (int)chr;								//문자를 강제형변환
				
		System.out.printf("입력한 문자는 \"%c\"이고 아스키코드값은 \"%d\" 이다",chr,num);
		
		input.close();
	}
}
