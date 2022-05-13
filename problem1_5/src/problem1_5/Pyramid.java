package problem1_5;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		//n단 피라미드를 표시하는 프로그램을 작성
		//i형째에는 (i-1)*2+1 개
		//n행째는 (n-1)*2+1 개
		
		Scanner input = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다");
		int a;
		do {
			System.out.print("단수는:");
			a = input.nextInt();
		}while(a<0);
			
		for(int i=0; i<a ; i++) {
			for(int j=0; j<a-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i-1)*2+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}
}
