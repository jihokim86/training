package problem1_4;

import java.util.Scanner;

public class CountDownFor {
 public static void main(String[] args) {
	 // 양의 정수 값을 카운트하는 문제를 For문으로 작성해라
	 
	 Scanner input = new Scanner(System.in);
	 
	 int a;
	 do {
		 System.out.println("정수값을 입력하면 0까지 카운트다운합니다.");
		 a=input.nextInt();
	 }while(a<=0);
	 int x=a;
	 for(int i =0 ; i<x ; i++) {
		 
		 System.out.println(a);
		 a--;
	 }
	 input.close();
 }
}
