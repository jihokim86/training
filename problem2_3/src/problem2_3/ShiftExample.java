package problem2_3;

import java.util.Scanner;

public class ShiftExample {

	public static void main(String[] args) {
		//지정값과 시프트 할 방향과 숫자를 입력하면 그 결과를 출력
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("지정값을 입력하세요");
		int x = input.nextInt();
		
		int retry;
		do {
			System.out.print("시프트할 방향을 정하세요.(1)오른쪽 (2)왼쪽 :");
			retry=input.nextInt();
		}while(retry<1 && retry>2);
		
		if(retry==1) {
			System.out.print("얼마만큼 시프트 시키겠습니까? :");
			int a = input.nextInt();
			int b = x >> a;
			System.out.print("시프트된 값은"+b+"입니다");
		}
		
		if(retry==2) {
			System.out.print("얼마만큼 시프트 시키겠습니까? :");
			int a = input.nextInt();
			int b = x << a;
			System.out.print("시프트된 값은"+b+"입니다");
		}
	}

}
