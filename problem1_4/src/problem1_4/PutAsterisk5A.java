package problem1_4;

import java.util.Scanner;

public class PutAsterisk5A {
	public static void main(String[] args) {
		// 읽은 개수만큼 *를 표시하는 프로그램을 제작
		// 5개 단위로 줄바꿈해서 출력해라
		
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("몇개의 *를 표시할까요? :");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<a; i++) {
			System.out.print("*");
			if(i%5==4) {
				System.out.println();
			}
		}
//		if(a%5 !=0) {
//			System.out.println();
//		}
		input.close();
	}
}
