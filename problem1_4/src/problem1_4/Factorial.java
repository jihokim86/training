package problem1_4;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		 //양의 정수 값을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("양의 정수 a값을 읽어서 1~a까지의 곱을 구한다");
		 System.out.println();
		 int a;
		 do {
		 System.out.print("양의정수를 입력하세요 :");
		 	a = input.nextInt();
		 }while(a<=0);
		 
		 double b=1;
		 
		 for(int i=1;i<=a;i++) {
			 b=i*b;
		 }
		 System.out.println("1~a까지의 곱은 :"+b);
		 input.close();
	 }

}
