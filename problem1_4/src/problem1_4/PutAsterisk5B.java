package problem1_4;

import java.util.Scanner;

public class PutAsterisk5B {
	public static void main(String[] args) {
	// 읽은 개수 만큼 * 표시(5개단위 줄바꿈)(방법2)
		Scanner input = new Scanner(System.in);
		
		int a;
		do {
			System.out.print("몇개의 *를 표시할까요? :");
			a = input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<a/5;i++) {  // a<5이면 패스함
			System.out.println("*****");
		}
			int rest = a%5; // a=6 입력시 rest=1
			if (rest>0) {
				for(int i =0 ; i<rest; i++) {
					System.out.print("*");
				}
					System.out.println();
			}
		input.close();
	}
}
