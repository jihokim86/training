package problem2_3;

import java.util.Scanner;

public class Octal {
	
	static final int p = 2;
	
	static void trans(int y) {
		int count =0;
		int k=y;
		
		
		while(k>0) {
			 k= k/y;
			count++;
		}
		
		int[] value = new int[count];
			
		for(int i=0; i<value.length;i++) {
			value[i] = y%p;
			y=y/p;
		}
		
		for(int j=value.length-1; j>=0;j--) {
			
			System.out.print(value[j]);
		}
		
	}
	public static void main(String[] args) {
		//10진수 -> 2진수로 변환하는 프로그램을 사용자 정의 함수로 생성
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("10진수를 입력하면 %d진수로 변경합니다 : ",p);
		int y = input.nextInt();
		
		trans(y);
	}

}
