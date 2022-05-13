package problem1_5;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		//1부터 n까지의 정수값에 각 값을 제곱해서 표시하는 프로그램을 작성
		//방법1
		
		Scanner input = new Scanner(System.in);
		int a;
		do {
			System.out.print("정수값을 입력하세요:");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=1 ; i<=a;i++) {
			System.out.println(i+"의 제곱은 "+i*i+" 입니다");
		}
		input.close();
	}

}
