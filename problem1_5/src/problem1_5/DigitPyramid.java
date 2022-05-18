package problem1_5;

import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		//n단의 숫자 피라미드를 표시하는 프로그램을 작성
		//i번째 행에는 i%10을 표시
		Scanner input = new Scanner(System.in);
		int a;
		int h=1;
		System.out.println("숫자피라미드를 표시합니다");
		do {
			System.out.print("단수는 :");
			a= input.nextInt();
		}while(a<0);
		
		for(int i=1; i<=a ; i++) {
			for(int j=1 ; j<=a-i+1;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=1+2*(i-1);k++) {
				System.out.print(h);
			}
			h++;
			if(h==10) { //20이 넘어가면 안될줄 알았는데? 되느니거같은데
				h=0;
			}
			System.out.println();
		}
		input.close();
	}
}
