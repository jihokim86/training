package problem2_3;

import java.util.Scanner;

public class TransferTest {
	
	static void trans(int y) {
		int count =0;
		int k=y;
		
		while(k>0) {
			 k= k/2;
			count++;
		}
		
		int[] value = new int[count];
			
		for(int i=0; i<value.length;i++) {
			value[i] = y%2;
			y=y/2;
		}
		
		for(int j=value.length-1; j>=0;j--) {
			
			System.out.print(value[j]);
		}
		
	}
	public static void main(String[] args) {
		//10진수 -> 2진수로 변환하는 프로그램을 사용자 정의 함수로 생성
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("십진수를 입력하세요");
		int y = input.nextInt();
		
		trans(y);
	}

}
