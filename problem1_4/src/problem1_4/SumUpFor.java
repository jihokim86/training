package problem1_4;

import java.util.Scanner;

public class SumUpFor {
 public static void main(String[] args) {
	// 양의 정수 값을 카운트하는 문제를 For문으로 작성해라
	 
		Scanner input = new Scanner(System.in);
		
		int a;
		int sum=0;
		do {
			System.out.println("1부터 n까지의 합을 구합니다");
			a=input.nextInt();
		}while(a<=0);
		
		for(int i=0; i<=a ; i++) {
			sum = sum +i;
		}
		
		System.out.println("1부터 n까지의 합 :"+sum);
		input.close();
 }
}
